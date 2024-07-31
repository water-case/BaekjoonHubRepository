import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int score = Integer.parseInt(br.readLine());

        int cnt = 1;
        while(st.hasMoreTokens()) {
            if(Integer.parseInt(st.nextToken()) > score) {
                cnt++;
            }
        }

        String res = cnt<=5 ? "A+" :
                            cnt<=15 ? "A0" :
                                    cnt<=30 ? "B+" :
                                            cnt<=35 ? "B0" :
                                                    cnt<=45 ? "C+" :
                                                            cnt<=48 ? "C0" : "F";

        System.out.println(res);
        br.close();
    }

}
