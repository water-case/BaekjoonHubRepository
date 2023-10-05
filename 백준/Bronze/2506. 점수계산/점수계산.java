import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;

        int N = Integer.parseInt(br.readLine());
        int calc = 1;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            if("0".equals(st.nextToken())) {
                calc = 1;
            } else {
                res += calc++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
