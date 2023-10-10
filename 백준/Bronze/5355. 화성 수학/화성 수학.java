import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            double initValue = Double.parseDouble(st.nextToken());

            while(st.hasMoreTokens()) {
                switch (st.nextToken()) {
                    case "@":
                        initValue *= 3;
                        break;
                    case "%":
                        initValue += 5;
                        break;
                    case "#":
                        initValue -= 7;
                        break;
                }
            }

            res.append(String.format("%.2f", initValue)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
