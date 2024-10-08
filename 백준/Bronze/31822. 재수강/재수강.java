import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;

        String scCd = br.readLine();
        String findStr = scCd.substring(0, 5);
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            if(br.readLine().startsWith(findStr)) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
