import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int ySum = 0, kSum = 0;
            for(int i=0; i<9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                ySum += Integer.parseInt(st.nextToken());
                kSum += Integer.parseInt(st.nextToken());
            }

            if(ySum == kSum) {
                res.append("Draw");
            } else if(ySum > kSum) {
                res.append("Yonsei");
            } else {
                res.append("Korea");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
