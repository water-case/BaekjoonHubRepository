import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        while(t-->0) {
            int n = Integer.parseInt(br.readLine());

            int cnt1 = 0, cnt2 = 0;
            while(n-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String p1 = st.nextToken();
                String p2 = st.nextToken();

                if(p1.equals("R")) {
                    if(p2.equals("P")) {
                        cnt2++;
                    } else if(p2.equals("S")) {
                        cnt1++;
                    }
                } else if(p1.equals("S")) {
                    if(p2.equals("R")) {
                        cnt2++;
                    } else if(p2.equals("P")) {
                        cnt1++;
                    }
                } else if(p1.equals("P")){
                    if(p2.equals("R")) {
                        cnt1++;
                    } else if(p2.equals("S")) {
                        cnt2++;
                    }
                }
            }

            String tResult = "TIE";
            if(cnt1 > cnt2) {
                tResult = "Player 1";
            } else if(cnt1 < cnt2){
                tResult = "Player 2";
            }
            res.append(tResult)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
