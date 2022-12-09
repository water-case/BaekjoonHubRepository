import java.io.*;
import java.util.*;

public class Main {

    static class Pos {
        int x, y;
        
        public Pos(int x, int y) {
            this.x=x;
            this.y=y;
        }
    }
    
    static int[] delx={-1, 0, 1, 0}; // 상우하좌
    static int[] dely={ 0, 1, 0,-1}; // 상우하좌
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int x=0, y=0;
        int minX=0, minY=0, maxX=0, maxY=0;
        ArrayList<Pos> list=new ArrayList<>();
        list.add(new Pos(x, y));
        
        int N=Integer.parseInt(br.readLine());
        char[] orders=br.readLine().toCharArray();
        int idx=0, d=2;
        while(N-->0) {
            char order=orders[idx++];
            
            switch(order) {
            case 'L': d=(d+3)%4; break;
            case 'R': d=(d+1)%4; break;
            case 'F':
                int dx=x+delx[d], dy=y+dely[d];
                list.add(new Pos(dx, dy));
                x=dx; y=dy;
                minX=Math.min(minX, x);
                minY=Math.min(minY, y);
                maxX=Math.max(maxX, x);
                maxY=Math.max(maxY, y);
                break;
            }
        }
        
        if(minX<0) {
            for(Pos p:list) 
                p.x-=minX;
            maxX-=minX;
        }
        if(minY<0) {
            for(Pos p:list) 
                p.y-=minY;
            maxY-=minY;
        }
        
        char[][] map=new char[maxX+1][maxY+1];
        for(char[] m:map) Arrays.fill(m, '#');
        
        for(Pos p:list)
            map[p.x][p.y]='.';
        
        StringBuilder sb=new StringBuilder();
        for(char[] m:map) {
            for(char mm:m)
                sb.append(mm);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
    
}
