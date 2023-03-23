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
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        x1 = Integer.parseInt(st.nextToken())-1;
        y1 = Integer.parseInt(st.nextToken())-1;
        x2 = Integer.parseInt(st.nextToken())-1;
        y2 = Integer.parseInt(st.nextToken())-1;

        map = new char[N][M];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        br.close();
    }

    static int N, M, x1, y1, x2, y2;
    static int[] delx = {-1, 0 ,1, 0};
    static int[] dely = { 0, 1, 0,-1};
    static char[][] map;

    private static void solve() {
        int res = 0;

        boolean[][] v = new boolean[N][M];

        int[][] dist = new int[N][M];
        for(int i=0; i<N; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<Node> pq = new PriorityQueue<>();

        dist[x1][y1] = 0;
        pq.offer(new Node(x1, y1, 0));

        while(!pq.isEmpty()) {
            Node now = pq.poll();

            if(v[now.x][now.y]) {
                continue;
            }
            v[now.x][now.y] = true;

            if(map[now.x][now.y] == '#') {
                res = now.cnt;
                break;
            }

            for(int d=0; d<4; d++) {
                int dx = now.x + delx[d], dy = now.y + dely[d];

                if(dx<0 || dx>=N || dy<0 || dy>=M || v[dx][dy]) {
                    continue;
                }

                if(map[dx][dy]!='0' && dist[dx][dy] > dist[now.x][now.y]+1) {
                    dist[dx][dy] = dist[now.x][now.y]+1;
                    pq.offer(new Node(dx, dy, dist[dx][dy]));
                } else if(map[dx][dy]=='0' && dist[dx][dy] > now.cnt) {
                    dist[dx][dy] = now.cnt;
                    pq.offer(new Node(dx, dy, now.cnt));
                }
            }

        }

        System.out.println(res);
    }

    static class Node implements Comparable<Node> {
        int x, y, cnt;

        public Node(int x, int y, int cnt) {
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Node o) {
            return cnt - o.cnt;
        }
    }

}
