import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        priceArr = new int[N][N];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<N; j++) {
                priceArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        br.close();
    }

    static int N;
    static int[][] priceArr;

    private static void solve() {
        StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
        int sum = 0, cnt = 0;

        sum += builtedCal();

        boolean[] v = new boolean[N];
        int[] dist = new int[N];
        Edge[] edgeArr = new Edge[N];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        for(int c=0; c<N; c++) {
            int min = Integer.MAX_VALUE;
            int minV = 0;

            for(int i=0; i<N; i++) {
                if(!v[i] && min>dist[i]) {
                    min = dist[i];
                    minV = i;
                }
            }

            v[minV] = true;
            sum += min;
            if(min!=0) {
                cnt++;
                sb2.append(edgeArr[minV].start+1).append(" ").append(edgeArr[minV].end+1).append("\n");
            }

            for(int i=0; i<N; i++) {
                if(!v[i] && priceArr[minV][i]>=0 && dist[i]>priceArr[minV][i]) {
                    dist[i] = priceArr[minV][i];
                    edgeArr[i] = new Edge(minV, i);
                }
            }
        }

        sb.append(sum).append(" ").append(cnt).append("\n");


        System.out.println(sb.toString() + sb2.toString());
    }

    private static int builtedCal() {
        int res = 0;

        for(int i=0; i<N; i++) {
            for(int j=i+1; j<N; j++) {
                if(priceArr[i][j] < 0) {
                    res += priceArr[i][j]*-1;
                    priceArr[i][j]=0;
                    priceArr[j][i]=0;
                }
            }
        }

        return res;
    }

    static class Edge {
        int start, end;

        public Edge(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

}
