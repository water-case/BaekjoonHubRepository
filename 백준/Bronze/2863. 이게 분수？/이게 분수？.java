import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[2][2];
        for(int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<2; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        double max = 0;
        int res = 0;
        for(int i=0; i<4; i++) {
            double cal = calArr(arr);
            if(cal > max) {
                res = i;
                max = cal;
            }

            rotate(arr);
        }

        System.out.println(res);
        br.close();
    }

    private static double calArr(int[][] arr) {
        return (double)arr[0][0]/arr[1][0] + (double)arr[0][1]/arr[1][1];
    }

    static int[] delx = { 0, 1, 0,-1}; // 우하좌상
    static int[] dely = { 1, 0,-1, 0}; // 우하좌상
    private static void rotate(int[][] arr) {
        int x = 0, y = 0;
        int pre = arr[x][y], next=0;
        for(int d=0; d<4; d++) {
            int dx = x + delx[d], dy = y + dely[d];
            next = arr[dx][dy];
            arr[dx][dy] = pre;
            pre = next;
            x = dx;
            y = dy;
        }
    }

}
