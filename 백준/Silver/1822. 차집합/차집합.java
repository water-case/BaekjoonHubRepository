import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());

        Set<Integer> set = new TreeSet<>();

        st = new StringTokenizer(br.readLine(), " ");
        while(nA-->0) {
            set.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine(), " ");
        while(nB-->0) {
            set.remove(Integer.parseInt(st.nextToken()));
        }

        System.out.println(set.size());

        if(set.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for(int num : set) {
                sb.append(num).append(" ");
            }
            System.out.println(sb.toString());
        }

        br.close();
    }

}
