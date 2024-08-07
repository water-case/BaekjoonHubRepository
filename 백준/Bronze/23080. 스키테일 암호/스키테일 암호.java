import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();
        for(int i=0; i<S.length; i++) {
            if(i%K==0) {
                res.append(S[i]);
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
