import java.io.*;
import java.util.*;

public class Main {

    static class FireBall {
        int m, s, d;

        public FireBall(int m, int s, int d) {
            this.m = m;
            this.s = s;
            this.d = d;
        }
    }

    static int[] delx={-1,-1, 0, 1, 1, 1, 0,-1}; // 12시부터 시계방향
    static int[] dely={ 0, 1, 1, 1, 0,-1,-1,-1}; // 12시부터 시계방향
    static ArrayList<FireBall>[][] map, tmap;
    static int N,M,K;

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        N=Integer.parseInt(st.nextToken());
        M=Integer.parseInt(st.nextToken());
        K=Integer.parseInt(st.nextToken());
        map=new ArrayList[N][N];
        makeMap(map);

        while(M-->0) {
            st=new StringTokenizer(br.readLine()," ");
            int r=Integer.parseInt(st.nextToken())-1;
            int c=Integer.parseInt(st.nextToken())-1;
            int m=Integer.parseInt(st.nextToken());
            int s=Integer.parseInt(st.nextToken());
            int d=Integer.parseInt(st.nextToken());

            map[r][c].add(new FireBall(m, s, d));
        }

        while(K-->0) {
            move();
            work();
        }

        int res=0;
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                for(int k=0; k<map[i][j].size(); k++)
                    res+=map[i][j].get(k).m;
        System.out.println(res);
        br.close();
    }

    private static void work() {
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j].size()<2) continue;

                int size=map[i][j].size();
                int sumM=0, sumS=0;
                int odd=0, even=0;
                for(FireBall ball:map[i][j]) {
                    sumM+=ball.m;
                    sumS+=ball.s;
                    if(ball.d%2==0) even++;
                    else odd++;
                }

                map[i][j].clear();
                int m=(int) Math.floor(sumM/5);
                if(m==0) continue;

                int s=(int) Math.floor(sumS/size);
                int d=1;
                if(odd==0 || even==0) d=0;
                for(int k=0; k<4; k++) {
                    map[i][j].add(new FireBall(m, s, (k*2)+d));
                }
            }
        }

    }

    private static void move() {
        tmap=new ArrayList[N][N];
        makeMap(tmap);

        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j].isEmpty()) continue;

                int size=map[i][j].size();
                while(size-->0) {
                    FireBall now=map[i][j].get(0);
                    map[i][j].remove(0);
                    int d=now.d;
                    int s=now.s;
                    int dx=i+delx[d]*(s%N);
                    int dy=j+dely[d]*(s%N);
                    if(dx<0) dx=dx+N;
                    if(dx>=N) dx=dx-N;
                    if(dy<0) dy=dy+N;
                    if(dy>=N) dy=dy-N;
                    tmap[dx][dy].add(now);
                }
            }
        }
        map=tmap;
    }

    private static void makeMap(ArrayList<?>[][] map) {
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                map[i][j]=new ArrayList<>();
    }

}
