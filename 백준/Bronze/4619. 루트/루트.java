import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int B = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            if(B==0 && N==0) {
                break;
            }

            int A = 0, idx = 1;
            while(true) {
                int calc = (int) Math.abs(B - Math.pow(idx, N));
                if(calc > 2_000_000) {
                    break;
                }

                if(Math.abs(B - Math.pow(A, N)) > calc ) {
                    A = idx;
                }

                idx++;
            }

            res.append(A).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
