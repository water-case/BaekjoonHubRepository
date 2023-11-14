import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        int N = Integer.parseInt(br.readLine());
        boolean[] comArr = new boolean[101];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            int now = Integer.parseInt(st.nextToken());
            if(comArr[now]) {
                res++;
                continue;
            }
            comArr[now] = true;
        }

        System.out.println(res);
        br.close();
    }

}
