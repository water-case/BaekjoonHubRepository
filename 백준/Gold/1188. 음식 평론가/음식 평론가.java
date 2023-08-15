import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 소시지수
        int M = Integer.parseInt(st.nextToken()); // 평론가수
        
        //  1개의 소시지를 M명에게 나눠줄 때 최소 칼질 횟수 : M - 1 번
        //  2개의 소시지를 M명에게 나눠줄 때 최소 칼질 횟수 : M - GCD(2, M) 번
        //  N개의 소시지를 M명에게 나눠줄 때 최소 칼질 횟수 : M - GCD(N, M) 번
        System.out.println(M - gcd(N, M));
        br.close();
    }

    private static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
