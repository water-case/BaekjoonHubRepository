import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] price = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=1; i<=N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }

        int[] memo = Arrays.copyOfRange(price, 0, N+1);

        memo[1] = price[1];
        for(int i=2; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                int cal = memo[j] + price[i-j];
                if(memo[i] > cal) {
                    memo[i] = cal;
                }
            }
        }

        System.out.println(memo[N]);
        br.close();
    }

}
