
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "";
        label: for(int i=0; i<15; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                String str = st.nextToken();
                if(str.equals("w")) {
                    res = "chunbae";
                    break label;
                } else if(str.equals("b")) {
                    res = "nabi";
                    break label;
                } else if(str.equals("g")) {
                    res = "yeongcheol";
                    break label;
                }
            }
        }

        System.out.println(res);
        br.close();
    }

}
