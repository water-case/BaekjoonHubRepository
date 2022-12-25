import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();
        while(true) {
            double N, M, B;
            try {
                StringTokenizer st = new StringTokenizer(br.readLine()," ");
                N = Double.parseDouble(st.nextToken());
                B = Double.parseDouble(st.nextToken());
                M = Double.parseDouble(st.nextToken());
            } catch (Exception e) {
                break;
            }

            int year = 0;
            while(N <= M) {
                year++;
                N*=(100+B)/100;
            }
            res.append(year).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
