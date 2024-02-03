import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String v1 = st.nextToken();
        String v2 = st.nextToken();

        if(v1.length() != v2.length()) {
            while(true) {
                if(v1.length() == v2.length()) {
                    break;
                }

                if(v1.length() > v2.length()) {
                    v2 = "0" + v2;
                } else {
                    v1 = "0" + v1;
                }
            }
        }

        String res = "";
        for(int i=0; i<v1.length(); i++) {
            res += String.valueOf(Integer.parseInt(v1.substring(i, i+1)) + Integer.parseInt(v2.substring(i, i+1)));
        }

        System.out.println(res);
        br.close();
    }

}
