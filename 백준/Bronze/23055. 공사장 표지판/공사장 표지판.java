import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            res.append("*");
        }
        res.append("\n");

        if(N>=2) {

            for(int i=1; i<N-1; i++) {

                for(int j=0; j<N; j++) {
                    if(j==0 || j==N-1 || j==i || j==N-i-1) {
                        res.append("*");
                    } else {
                        res.append(" ");
                    }
                }

                res.append("\n");
            }

            for(int i=0; i<N; i++) {
                res.append("*");
            }
            res.append("\n");

        }

        System.out.println(res.toString());
        br.close();
    }

}
