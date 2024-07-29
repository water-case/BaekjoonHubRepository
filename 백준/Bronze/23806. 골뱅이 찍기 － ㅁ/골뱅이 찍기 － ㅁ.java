import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 가로 5칸
        for(int i=0; i<N; i++) {
            for(int j=0; j<5; j++) {
                printAt(res, N);
            }
            res.append("\n");
        }

        // 세로 3칸
        for(int i=0; i<N; i++) {
            for(int j=0; j<3; j++) {
                printAt(res, N);
                printSpace(res, N);
                printSpace(res, N);
                printSpace(res, N);
                printAt(res, N);
                res.append("\n");
            }
        }

        // 가로 5칸
        for(int i=0; i<N; i++) {
            for(int j=0; j<5; j++) {
                printAt(res, N);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static void printAt(StringBuilder res, int N) {
        for(int i=0; i<N; i++) {
            res.append("@");
        }
    }

    private static void printSpace(StringBuilder res, int N) {
        for(int i=0; i<N; i++) {
            res.append(" ");
        }
    }

}
