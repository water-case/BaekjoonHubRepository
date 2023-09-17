import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int cnt = 0, idx = 1;
        while(true) {
            if(!String.valueOf(idx).contains(String.valueOf(L))) {
                cnt++;
            }

            if(cnt == N) {
                break;
            }

            idx++;
        }

        System.out.println(idx);
        br.close();
    }

}
