import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());

            res.append("Pairs for ")
                .append(n)
                .append(":");

            int cnt = 0;
            for(int i=1; i<=n; i++) {
                for(int j=i+1; j<=n; j++) {
                    int cal = i+j;

                    if(cal == n) {
                        if(cnt++ != 0) {
                            res.append(",");
                        }

                        res.append(" ")
                            .append(i)
                            .append(" ")
                            .append(j);
                        break;
                    }

                    if(cal > n) {
                        break;
                    }
                }
            }

            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
