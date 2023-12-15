import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int milkIdx = 0, res = 0;
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            if(Integer.parseInt(st.nextToken()) == milkIdx) {
                res++;
                milkIdx = (milkIdx+1)%3;
            }
        }

        System.out.println(res);
        br.close();
    }

}
