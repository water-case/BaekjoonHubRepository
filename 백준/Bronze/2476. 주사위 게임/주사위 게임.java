import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int cal = 0;
            if(a==b && b==c) {
                cal = 10_000 + a*1_000;
            } else if(a==b) {
                cal = 1_000 + a*100;
            } else if(b==c) {
                cal = 1_000 + b*100;
            } else if(a==c) {
                cal = 1_000 + c*100;
            } else {
                cal = Math.max(Math.max(a, b), c) * 100;
            }

            res = Math.max(res, cal);
        }

        System.out.println(res);
        br.close();
    }

}
