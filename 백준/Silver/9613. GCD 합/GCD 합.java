import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int[] nums = new int[n];
            for(int i=0; i<n; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    sum += gcd(nums[i], nums[j]);
                }
            }
            res.append(sum).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int gcd(int x, int y) {

        if(y==0) {
            return x;
        } else {
            return gcd(y, x%y);
        }

    }

}
