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
        int L = Integer.parseInt(st.nextToken());

        int lineCnt = 0, horseCnt = 0;
        while(N-->0) {
            char[] sArr = ("0" + br.readLine()).toCharArray();

            int tLineCnt = 0;
            for(int i=1; i<sArr.length; i++) {
                if(sArr[i]=='1' && sArr[i-1]=='0') {
                    tLineCnt++;
                }
            }

            if(tLineCnt == lineCnt) {
                horseCnt++;
            } else if(tLineCnt > lineCnt) {
                lineCnt = tLineCnt;
                horseCnt = 1;
            }
        }

        System.out.println(lineCnt + " " + horseCnt);
        br.close();
    }

}
