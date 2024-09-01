import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = "";
        int max = Integer.MIN_VALUE;

        for(int i=0; i<7; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                String name = st.nextToken();
                int num = Integer.parseInt(st.nextToken());

                if(num > max) {
                    max = num;
                    res = name;
                }
            }
        }

        System.out.println(res);
        br.close();
    }

}
