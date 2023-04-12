import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int gold = Integer.parseInt(st.nextToken());
            int silver = Integer.parseInt(st.nextToken());
            int bronze = Integer.parseInt(st.nextToken());
            pq.offer(new Medal(num, gold, silver, bronze));
        }

        br.close();
    }

    static int N, K;
    static PriorityQueue<Medal> pq;

    private static void solve() {
        int rank = 1, same = 0;
        Medal prev = null;
        while(!pq.isEmpty()){
            Medal now = pq.poll();

            if(prev!=null && prev.equals(now)) {
                same++;
            }

            if(now.num == K) {
                rank -= same;
                break;
            }

            prev = now;
            rank++;
        }

        System.out.println(rank);
    }

    static private class Medal implements Comparable<Medal> {
        int num, gold, silver, bronze;

        public Medal(int num, int gold, int silver, int bronze) {
            this.num = num;
            this.gold = gold;
            this.silver = silver;
            this.bronze = bronze;
        }

        @Override
        public int compareTo(Medal o) {
            int res = -Integer.compare(gold, o.gold);
            if(res == 0) {
                res = -Integer.compare(silver, o.silver);
            }
            if(res == 0) {
                res = -Integer.compare(bronze, o.bronze);
            }
            return res;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Medal medal = (Medal) o;
            return gold == medal.gold && silver == medal.silver && bronze == medal.bronze;
        }
    }

}
