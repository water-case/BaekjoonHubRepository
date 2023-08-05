import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int[] memo = prefixSum(arr);

        StringBuilder res = new StringBuilder();
        while(Q-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int L = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            res.append(memo[R] - memo[L-1]).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int[] prefixSum(int[] arr) {

        int[] res = new int[arr.length];

        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
            res[i] = sum;
        }

        return res;
    }

}
