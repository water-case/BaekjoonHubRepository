import java.io.*;
import java.util.*;

public class Main {

    enum Y { A,B,C,D,E,F,G,H }
    enum DIRECT { T,RT,R,RB,B,LB,L,LT }
    
    static int[] delx={ 1, 1, 0,-1,-1,-1, 0, 1}; // 12 부터 시계방향 
    static int[] dely={ 0, 1, 1, 1, 0,-1,-1,-1}; // 12 부터 시계방향 
    static int[][] map;
    static int N;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        String[] king=st.nextToken().split("");
        int ky=Y.valueOf(king[0]).ordinal();
        int kx=Integer.parseInt(king[1]);
        String[] stone=st.nextToken().split("");
        int sy=Y.valueOf(stone[0]).ordinal();
        int sx=Integer.parseInt(stone[1]);
        N=Integer.parseInt(st.nextToken());
        
        while(N-->0) {
            String order=br.readLine();
            
            int dx=kx+delx[DIRECT.valueOf(order).ordinal()];
            int dy=ky+dely[DIRECT.valueOf(order).ordinal()];
            if(dx<1||dx>8||dy<0||dy>7) continue;
            if(dx==sx&&dy==sy) {
                int dsx=sx+delx[DIRECT.valueOf(order).ordinal()];
                int dsy=sy+dely[DIRECT.valueOf(order).ordinal()];
                if(dsx<1||dsx>8||dsy<0||dsy>7) continue;
                sx=dsx;
                sy=dsy;
            }
            kx=dx;
            ky=dy;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(Y.values()[ky]).append(kx).append("\n").append(Y.values()[sy]).append(sx);
        System.out.println(sb.toString());
        br.close();
    }
    
}
