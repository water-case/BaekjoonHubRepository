import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String chk = br.readLine();
        int res = 0;
        while(N-->0) {
            if(chk.equals(st.nextToken())) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
