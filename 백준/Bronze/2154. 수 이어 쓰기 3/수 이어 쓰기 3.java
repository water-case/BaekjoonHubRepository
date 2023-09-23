import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=N; i++) {
            sb.append(i);
        }

        System.out.println(sb.toString().indexOf(String.valueOf(N)));
        br.close();
    }

}
