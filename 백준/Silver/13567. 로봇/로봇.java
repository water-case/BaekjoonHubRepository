import java.io.*;
import java.util.*;

public class Main {

    static class Pos {
        int x, y;
        
        Pos(int x, int y) {
            this.x=x;
            this.y=y;
        }
        
        public boolean move(int d, int n) {
            while(n-->0) {
                int dx=x+delx[d], dy=y+dely[d];
                if(dx<0||dx>M||dy<0||dy>M) {
                    x=-1; 
                    y=-1;
                    return false;
                }
                x=dx;
                y=dy;
            }
            return true;
        }
        
        @Override
        public String toString() {
            if(x==-1 || y==-1) return "-1";
            
            return x+ " " + y;
        }
    }
    
    static int[] delx={ 0, 1, 0,-1}; // 상우하좌
    static int[] dely={ 1, 0,-1, 0}; // 상우하좌
    static int M, n, d=1;
    static Pos res=new Pos(0,0);
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        
        M=Integer.parseInt(st.nextToken());
        n=Integer.parseInt(st.nextToken());
        
        while(n-->0) {
            st=new StringTokenizer(br.readLine()," ");
            String order=st.nextToken(); // move면 방향대로 직진, turn 이면 회전
            int num=Integer.parseInt(st.nextToken()); // move면 이동칸수, turn 이면 0은 반시계 1은 시계
            
            if("MOVE".equals(order)) {
                if(!res.move(d, num)) {
                    break;
                }
            } else {
                if(num==0) d=(d+3)%4;
                else d=(d+1)%4;
            }
        }
        
        System.out.println(res);
    }
    
}
