import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {

    static boolean[][] map = new boolean[6][6];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] order = br.readLine().split("");
        int startX = order[1].charAt(0) - '1';
        int startY = order[0].charAt(0) - 'A';

        int x = startX;
        int y = startY;

        String res = "Valid";
        int ox, oy;
        for(int i=0; i<=35; i++) {
            if(i==35) {
                ox = startX;
                oy = startY;
            } else {
                order = br.readLine().split("");
                ox = order[1].charAt(0) - '1';
                oy = order[0].charAt(0) - 'A';
            }

            if(!map[ox][oy] &&
                    ((abs(ox-x)==1 && abs(oy-y)==2) || (abs(ox-x)==2 && abs(oy-y)==1))) {
                map[ox][oy] = true;
                x = ox;
                y = oy;
            } else {
                res = "Invalid";
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
