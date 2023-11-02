import java.io.*;
import java.util.Arrays;

public class Main {

    static int[] delx = {-2,-1, 0, 1, 2, 1, 0,-1}; // 상부터 시계방향
    static int[] dely = { 0, 1, 2, 1, 0,-1,-2,-1}; // 상부터 시계방향

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] carr = br.readLine().toCharArray();

        char[][] map = new char[5][carr.length * 5 - (carr.length - 1)];
        for(int i=0; i<5; i++) {
            Arrays.fill(map[i], '.');
        }

        for(int i=0; i<5; i++) {
            for(int j=0; j<map[i].length; j++) {
                if(i%2 == 0){
                    if(i == 2) {
                        if(j % 4 == 0) {
                            map[i][j] = '#';
                        }
                    } else {
                        if((j-2) % 4 == 0) {
                            map[i][j] = '#';
                        }
                    }
                } else {
                    if(j%2 != 0) {
                        map[i][j] = '#';
                    }
                }
            }
        }

        for(int i=0; i<carr.length; i++) {
            int y = 4*(i+1)-2;
            map[2][y] = carr[i];

            if((i+1) % 3 == 0) {
                for(int d=0; d<8; d++) {
                    int dx = 2 + delx[d], dy = y + dely[d];
                    map[dx][dy] = '*';
                }
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                res.append(map[i][j]);
            }
            res.append("\n");
        }
        System.out.println(res.toString());
        br.close();
    }

}
