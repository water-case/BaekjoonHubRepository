import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int oddSum = 0, evenSum = 0;
            int k = Integer.parseInt(st.nextToken());

            while(st.hasMoreTokens()) {
                int num = Integer.parseInt(st.nextToken());

                if(num%2 != 0) {
                    oddSum += num;
                } else {
                    evenSum += num;
                }
            }

            String loopResult = oddSum == evenSum ? "TIE" :
                                    oddSum > evenSum ? "ODD" : "EVEN";

            res.append(loopResult).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
