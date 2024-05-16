import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * 0 북
         * 1 동
         * 2 남
         * 3 서
         */

        int N = 10;
        int direct = 0;
        while(N-->0) {
            int t = Integer.parseInt(br.readLine());

            switch (t) {
                case 1: direct = (direct+1)%4; break;
                case 2: direct = (direct+2)%4; break;
                case 3: direct = (direct+3)%4; break;
            }
        }

        String res = "";
        switch (direct) {
            case 0: res = "N"; break;
            case 1: res = "E"; break;
            case 2: res = "S"; break;
            case 3: res = "W"; break;
        }

        System.out.println(res);
        br.close();
    }

}
