import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String res = "";
        if(M==1 || M==2) {
            res = "NEWBIE!";
        } else if(M <= N) {
            res = "OLDBIE!";
        } else {
            res = "TLE!";
        }

        System.out.println(res);
        br.close();
    }

}
