import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = "";

        int N = Integer.parseInt(br.readLine());
        String stStr = br.readLine();
        int sCnt = (int) Arrays.stream(stStr.split(""))
                                .filter(s -> s.equals("s"))
                                .count();
        int tCnt = stStr.length() - sCnt;

        for(int i=0; i<stStr.length(); i++) {
            if(sCnt == tCnt) {
                res = stStr.substring(i);
                break;
            }

            if(stStr.charAt(i) == 's') {
                sCnt--;
            } else {
                tCnt--;
            }
        }

        System.out.println(res);
        br.close();
    }

}
