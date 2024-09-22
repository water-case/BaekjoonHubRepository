import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = "Yes";

        int N = Integer.parseInt(br.readLine());
        char[] aArr = br.readLine().toCharArray();
        for(int i=1; i<2*N; i++) {
            if(aArr[i] == aArr[i-1]) {
                res = "No";
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
