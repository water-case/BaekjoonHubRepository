import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int P = Integer.parseInt(br.readLine());
        while(P-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            res.append(N).append(" ").append(cycleCheck(M)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int cycleCheck(int m) {
        int cnt = 0;

        int fibo1 = 1;
        int fibo2 = 1;
        while(true) {
            int tmp = (fibo1 + fibo2) % m;

            fibo1 = fibo2;
            fibo2 = tmp;

            cnt++;
            if(fibo1%m == 1 && fibo2%m == 1) {
                break;
            }
        }

        return cnt;
    }

}
