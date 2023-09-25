import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());

            int cnt = 0;
            for(int i=1; i<=x; i++) {
                for(int j=1; j<=y; j++) {
                    int calxy = i%j;
                    for(int k=1; k<=z; k++) {
                        if(calxy == j%k && calxy == k%i) {
                            cnt++;
                        }
                    }
                }
            }
            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
