import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String mbti = br.readLine();
        int res = 0;
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            if(mbti.equals(br.readLine())) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
