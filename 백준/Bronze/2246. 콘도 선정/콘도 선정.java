import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<int[]> nList = new ArrayList<>();
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int D = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            nList.add(new int[] {D, C, N});
        }

        List<int[]> Dlist = nList.stream()
                .sorted((o1, o2) -> Integer.compare(o1[0], o2[0]))
                .collect(Collectors.toList());

        List<int[]> Clist = nList.stream()
                .sorted((o1, o2) -> Integer.compare(o1[1], o2[1]))
                .collect(Collectors.toList());

        int res = 0;
        List<Integer> canList = new ArrayList<>();
        label:for(int i=0; i<nList.size(); i++) {
            int[] now = Dlist.get(i);
            for(int j=0; j<i; j++) {
                if(now[0] == Dlist.get(j)[0]) {
                    continue;
                }

                if(now[1] >= Dlist.get(j)[1]) {
                    continue label;
                }
            }
            canList.add(now[2]);
        }

        label:for(int i=0; i<nList.size(); i++) {
            int[] now = Clist.get(i);
            for(int j=0; j<i; j++) {
                if(now[1] == Clist.get(j)[1]) {
                    continue;
                }

                if(now[0] >= Clist.get(j)[0]) {
                    continue label;
                }
            }

            if(canList.contains(now[2])) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
