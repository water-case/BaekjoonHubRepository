import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int N = Integer.parseInt(br.readLine());

            int cSum = 0;
            double calc = 0.0D;
            while(N-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                int c = Integer.parseInt(st.nextToken());
                double g = Double.parseDouble(st.nextToken());

                cSum += c;
                calc += c * g;
            }

            res.append(cSum).append(" ")
                    .append(String.format("%.1f", calc / cSum))
                    .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
