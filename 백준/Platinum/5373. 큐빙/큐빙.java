import java.io.*;
import java.util.*;

public class Main {

    static char[] color = new char[] {'w', 'y', 'r', 'o', 'g', 'b'};

    static class Cube {
        char[] cube;
        int[][][] idxArr;
        int[][] rotateData;

        public Cube() {
            cube = new char[54];
            for(int i=0; i<6; i++) {
                for(int j=0; j<9; j++){
                    cube[i*9 + j] = color[i];
                }
            }

            idxArr = new int[6][3][3];
            for(int i=0; i<6; i++) {
                for(int j=0; j<3; j++) {
                    for(int k=0; k<3; k++){
                        idxArr[i][j][k] = i*9 + j*3 + k;
                    }
                }
            }

            rotateData = new int[][] {
                    {36,37,38,18,19,20,45,46,47,27,28,29},
                    {33,34,35,51,52,53,24,25,26,42,43,44},
                    { 6, 7, 8,44,41,38,11,10, 9,45,48,51},
                    { 2, 1, 0,53,50,47,15,16,17,36,39,42},
                    { 0, 3, 6,35,32,29, 9,12,15,18,21,24},
                    { 8, 5, 2,26,23,20,17,14,11,27,30,33},
            };
        }

        public void move(char way, char direct) {
            int cnt = direct=='-' ? 3 : 1; // 시계방향으로 3번 돌리면 반시계와 같은 결과
            for(int i=0; i<cnt; i++){
                mBranch(way); // 시계방향
            }
        }

        private void mBranch(char way) {
            int idx = -1;
            switch (way) {
                case 'U': idx = 0; break;
                case 'D': idx = 1; break;
                case 'F': idx = 2; break;
                case 'B': idx = 3; break;
                case 'L': idx = 4; break;
                case 'R': idx = 5; break;
            }
            rotate(idx);
        }

        private void rotate(int idx) {

            // 사이드 회전
            char[] sideTmp = new char[12];
            for(int i=0; i<12; i++) {
                sideTmp[i] = cube[rotateData[idx][i]];
            }
            for(int i=0; i<12; i++) {
                cube[rotateData[idx][i]] = sideTmp[(i+3) % 12];
            }

            // 메인 회전
            char[][] mainTmp = new char[3][3];
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    mainTmp[j][2-i] = cube[idxArr[idx][i][j]];
                }
            }
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    cube[idxArr[idx][i][j]] = mainTmp[i][j];
                }
            }
        }


        public void printUp() {
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    System.out.print(cube[idxArr[0][i][j]]);
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            Cube cube = new Cube();

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                String order = st.nextToken();
                cube.move(order.charAt(0), order.charAt(1));
            }
            cube.printUp();
        }
        br.close();
    }

}
