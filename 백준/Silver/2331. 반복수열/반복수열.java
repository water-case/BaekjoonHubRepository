import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int A, P;

    private static void solve() {
        int res = 0;

        List<Integer> numList = new ArrayList<>();
        numList.add(A);

        int N = A, cal = A;
        while(true) {
            N = cal;
            cal = 0;
            while(N>0) {
                cal += (int) Math.pow(N%10, P);
                N /= 10;
            }

            if(numList.contains(cal)) {
                res = numList.indexOf(cal);
                break;
            }

            numList.add(cal);
        }


        System.out.println(res);
    }

}
