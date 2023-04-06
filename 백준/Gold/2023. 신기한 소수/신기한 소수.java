import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        br.close();
    }

    static int N;
    static StringBuilder sb;

    private static void solve() {
        sb = new StringBuilder();

        int[] firstNum = {2,3,5,7};
        for(int i=0; i<firstNum.length; i++) {
            dfs(firstNum[i], 1);
        }

        System.out.println(sb.toString());
    }

    private static void dfs(int num, int cnt) {
        if(cnt == N) {
            sb.append(num).append("\n");
        }

        for(int i=1; i<10; i+=2) {
            int cal = num*10 + i;
            if(isPrime(cal)) {
                dfs(cal, cnt+1);
            }
        }
    }

    private static boolean isPrime(int num) {
        if(num<2) {
            return false;
        }

        for(int i=2; i*i<=num; i++) {
            if(num%i == 0) {
                return false;
            }
        }

        return true;
    }

}
