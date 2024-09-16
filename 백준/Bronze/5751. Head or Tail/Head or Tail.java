import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("0")) {
            int N = Integer.parseInt(input);
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int maryCnt = 0, johnCnt = 0;
            while(st.hasMoreTokens()) {
                if(Integer.parseInt(st.nextToken()) == 0) {
                    maryCnt++;
                } else {
                    johnCnt++;
                }
            }

            res.append("Mary won ").append(maryCnt).append(" times and John won ").append(johnCnt).append(" times").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
