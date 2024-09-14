import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        char[] originText = br.readLine().toCharArray();
        char[] rewrittenText = br.readLine().toCharArray();

        int res = 0;
        for(int i=0; i<n; i++) {
            if(originText[i] != rewrittenText[i]) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
