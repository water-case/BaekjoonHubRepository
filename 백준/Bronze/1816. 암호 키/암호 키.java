import java.io.*;
import java.util.*;

public class Main {

    static final int SIZE = 1_000_001;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        List<Integer> primeList = makePrimeList(SIZE);

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            long S = Long.parseLong(br.readLine());

            String resStr = "YES";
            for(int prime : primeList) {
                if(S % prime == 0) {
                    resStr = "NO";
                }
            }
            res.append(resStr).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static List<Integer> makePrimeList(int size) {
        boolean[] prime = new boolean[size];
        Arrays.fill(prime, true);

        for(int i=2; i<size; i++) {
            if(prime[i]) {
                continue;
            }

            for(int j=i; j<size; j+=i) {
                prime[j] = false;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i=2; i<size; i++) {
            if(prime[i]) {
                res.add(i);
            }
        }

        return res;
    }

}
