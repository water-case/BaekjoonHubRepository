import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loopCnt = 6;
        int winCnt = 0;
        while(loopCnt-->0) {
            if(br.readLine().equals("W")) {
                winCnt++;
            }
        }

        int res = -1;

        switch (winCnt) {
            case 6:
            case 5: res = 1; break;
            case 4:
            case 3: res = 2; break;
            case 2:
            case 1: res = 3; break;
        }

        System.out.println(res);
        br.close();
    }

}
