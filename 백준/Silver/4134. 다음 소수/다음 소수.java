import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            long n = Long.parseLong(br.readLine());

            while(!isPrime(n)) {
                n++;
            }
            res.append(n).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static boolean isPrime(long num) {
        if(num == 0 || num == 1) {
            return false;
        }

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0) {
                return false;
            }
        }

        return true;
    }

}
