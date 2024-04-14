import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;

        for(int i=0; i<8; i++) {
            String[] str = br.readLine().split("");
            for(int j=0; j<8; j++) {
                res += chessScoreCal(str[j]);
            }
        }

        System.out.println(res);
        br.close();
    }

    private static int chessScoreCal(String chess) {
        int res = 0;

        switch (chess.toUpperCase()) {
            case  "P": res = 1; break;
            case  "N":
            case  "B": res = 3; break;
            case  "R": res = 5; break;
            case  "Q": res = 9; break;
        }

        return Character.isUpperCase(chess.charAt(0)) ? res : -res;
    }

}
