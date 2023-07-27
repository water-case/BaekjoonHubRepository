import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        BigInteger[][] memo = new BigInteger[101][101];

        for(int i=1; i<=n; i++) {
            for(int j=0; j<=i; j++) {
                if(j==0 || j==i) {
                    memo[i][j] = BigInteger.ONE;
                } else {
                    // nCm = n-1Cm + n-1Cm-1
                    memo[i][j] = memo[i-1][j].add(memo[i-1][j-1]);
                }
            }
        }

        System.out.println(memo[n][m]);
        br.close();
    }

}
