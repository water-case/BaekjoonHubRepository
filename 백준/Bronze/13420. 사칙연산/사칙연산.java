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
        String[] sArr = br.readLine().split(" ");
            long cal = 0;
            long a = Long.parseLong(sArr[0]);
            long b = Long.parseLong(sArr[2]);
            switch (sArr[1]) {
                case "+": cal = a + b; break;
                case "-": cal = a - b; break;
                case "*": cal = a * b; break;
                case "/": cal = a / b; break;
            }

            res.append(cal == Long.parseLong(sArr[4]) ? "correct" : "wrong answer")
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
