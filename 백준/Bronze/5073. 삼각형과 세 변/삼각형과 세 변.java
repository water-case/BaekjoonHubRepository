import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a == 0) {
                break;
            }

            int max = Math.max(Math.max(a, b), c);
            if(max >= a + b + c - max) {
                res.append("Invalid");
            } else if(a == b && b == c) {
                res.append("Equilateral");
            } else if(a == b || a == c || b == c) {
                res.append("Isosceles");
            } else {
                res.append("Scalene");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
