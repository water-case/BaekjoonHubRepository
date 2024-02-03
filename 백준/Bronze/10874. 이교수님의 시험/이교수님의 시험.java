import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int num = 1;
        while(N-->0) {
            int score = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=10; j++) {
                int ans = ((j-1) % 5) + 1;
                if(ans == Integer.parseInt(st.nextToken())) {
                    score++;
                }
            }

            if(score==10) {
                res.append(num).append("\n");
            }
            num++;
        }

        System.out.println(res.toString());
        br.close();
    }

}
