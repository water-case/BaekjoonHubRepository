import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static int res, W, H;
    static char[][] g;
    static int[][] dist;
    static int[] delx={-1, 0, 1, 0}; // 상우하좌
    static int[] dely={ 0, 1, 0,-1}; // 상우하좌
    static Node start, end;

    private static void solve() {
        ArrayDeque<Node> q=new ArrayDeque<>();
        q.offer(start);
        dist[start.x][start.y]=0;

        while(!q.isEmpty()) {
            Node now=q.poll();

            for(int d=0; d<4; d++) {
                int dx=now.x+delx[d], dy=now.y+dely[d];

                while(dx>=0 && dx<H && dy>=0 && dy<W) {
                    if(g[dx][dy] == '*') {
                        break;
                    } else {
                        if(dist[dx][dy] == Integer.MAX_VALUE) {
                            dist[dx][dy] = now.cnt;
                            q.offer(new Node(dx, dy, now.cnt+1));
                        }
                    }

                    dx += delx[d];
                    dy += dely[d];
                }
            }
        }
        res = dist[end.x][end.y];
    }

    private static void init(BufferedReader br) throws Exception {
        res=0;

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        W=Integer.parseInt(st.nextToken());
        H=Integer.parseInt(st.nextToken());
        g=new char[H][W];
        dist=new int[H][W];

        for(int i=0; i<H; i++) {
            g[i]=br.readLine().toCharArray();
            for(int j=0; j<W; j++) {
                dist[i][j]=Integer.MAX_VALUE;

                if(g[i][j]=='C') {
                    if(start==null) {
                        start=new Node(i, j, 0);
                    } else {
                        end=new Node(i, j, 0);
                    }
                }
            }
        }
    }

    static class Node implements Comparable<Node> {
        int x, y, cnt;

        public Node(int x, int y, int cnt) {
            super();
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }

        @Override
        public int compareTo(Node o) {
            return Integer.compare(cnt, o.cnt);
        }
    }

}
