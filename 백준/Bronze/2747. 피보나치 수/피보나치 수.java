import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static int n, res;
    static ArrayList<Integer> fibo;

    private static void solve() {
        fibo.add(0);
        fibo.add(1);
        for(int i=0; i<n-1; i++) {
            int fn1 = fibo.get(i);
            int fn2 = fibo.get(i+1);

            fibo.add(fn1 + fn2);
        }

        res = fibo.get(n);
    }

    private static void init(BufferedReader br) throws Exception {
        n = Integer.parseInt(br.readLine());
        fibo = new ArrayList<>();
    }

}
