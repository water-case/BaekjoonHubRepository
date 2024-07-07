import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N+2; i++) {
            res.append("@");
            String str = i==0||i==N+1 ? "@" : " ";
            for(int j=1; j<N+1; j++) {
                res.append(str);
            }
            res.append("@")
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
