import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int N = Integer.parseInt(br.readLine());

            List<Pair> pairs = new ArrayList<>();
            while(N-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                pairs.add(new Pair(st.nextToken(), Integer.parseInt(st.nextToken())));
            }
            Collections.sort(pairs);

            res.append(pairs.get(0).S).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    static class Pair implements Comparable<Pair> {
        private String S;
        private int L;

        public Pair(String s, int l) {
            S = s;
            L = l;
        }

        @Override
        public int compareTo(Pair o) {
            return -Integer.compare(L, o.L);
        }
    }

}
