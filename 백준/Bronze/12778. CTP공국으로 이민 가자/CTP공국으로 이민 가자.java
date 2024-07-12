import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int M = Integer.parseInt(st.nextToken());
            String C = st.nextToken();

            st = new StringTokenizer(br.readLine(), " ");
            while(M-->0) {
                if(C.equals("C")) {
                    res.append(st.nextToken().charAt(0)-64).append(" ");
                } else {
                    res.append((char) (Integer.parseInt(st.nextToken())+64)).append(" ");
                }
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
