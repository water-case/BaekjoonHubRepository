import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(T-->0) {
            res.append(isPerfactNum(Integer.parseInt(st.nextToken()))).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static String isPerfactNum(int num) {
        if(num == 1) {
            return "Deficient";
        }

        int sum = 1;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i == 0) {
                int n1 = i, n2 = num/i;

                sum += n1;
                if(n1 != n2) {
                    sum += n2;
                }
            }
        }

        if(sum > num) {
            return "Abundant";
        } else if(sum < num) {
            return "Deficient";
        } else {
            return "Perfect";
        }
    }

}
