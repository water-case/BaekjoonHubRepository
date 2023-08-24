import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<int[]> nList = new ArrayList<>();
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            int[] lecture = new int[] {s, e};
            nList.add(lecture);
        }

        Collections.sort(nList, (o1, o2) -> {
            if(o1[0] != o2[0]) {
                return Integer.compare(o1[0], o2[0]);
            }
            return Integer.compare(o1[1], o2[1]);
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(nList.get(0)[1]);
        for(int i=1; i<nList.size(); i++) {
            if(pq.peek() <= nList.get(i)[0]) {
                pq.poll();
            }
            pq.offer(nList.get(i)[1]);
        }

        System.out.println(pq.size());
        br.close();
    }

}
