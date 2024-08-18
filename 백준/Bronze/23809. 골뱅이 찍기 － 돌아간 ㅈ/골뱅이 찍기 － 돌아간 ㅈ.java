import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        boolean[][] pattern = new boolean[][] {
                {true, false, false, false, true},
                {true, false, false,  true},
                {true, true,  true},
                {true, false, false,  true},
                {true, false, false, false, true}
        };

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<5; i++) {
            printLine(res, N, pattern[i]);
        }

        System.out.println(res.toString());
        br.close();
    }

    private static void printLine(StringBuilder res, int N, boolean[] dotMap) {
        for(int i=0; i<N; i++) {
            for(boolean dot : dotMap) {
                printDot(res, N, dot ? "@" : " ");
            }
            res.append("\n");
        }
    }

    private static void printDot(StringBuilder res, int N, String Pattern) {
        for(int i=0; i<N; i++) {
            res.append(Pattern);
        }
    }

}
