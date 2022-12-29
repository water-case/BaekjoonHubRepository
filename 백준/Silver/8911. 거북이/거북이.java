import java.io.*;
import java.util.*;

public class Main {

    static int[] delx = {-1, 0, 1, 0};
    static int[] dely = { 0, 1, 0,-1};

    static int x, y, d, dx, dy, minX, maxX, minY, maxY;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            char[] program = br.readLine().toCharArray();

            init();

            for(char order : program) {
                switch (order) {
                    case 'F':
                        dx = x + delx[d];
                        dy = y + dely[d];
                        move();
                        break;
                    case 'B':
                        dx = x + delx[(d+2)%4];
                        dy = y + dely[(d+2)%4];
                        move();
                        break;
                    case 'L':
                        d = (d+3)%4;
                        break;
                    case 'R':
                        d = (d+1)%4;
                        break;
                }
            }
            
            int res = (maxX - minX) * (maxY - minY);
            sb.append(res).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }

    private static void init() {
        x = 500;
        y = 500;
        d = 0;
        minX = 500;
        maxX = 500;
        minY = 500;
        maxY = 500;
    }

    private static void move() {
        minX = Math.min(minX, dx);
        maxX = Math.max(maxX, dx);
        minY = Math.min(minY, dy);
        maxY = Math.max(maxY, dy);
        x=dx;
        y=dy;
    }

}
