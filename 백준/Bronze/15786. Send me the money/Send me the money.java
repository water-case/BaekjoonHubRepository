import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[] nArr = br.readLine().toCharArray();
        while(M-->0) {
            char[] mArr = br.readLine().toCharArray();

            int nIdx = 0;
            String idxYn = "false";
            for(char m : mArr) {
                if(nArr[nIdx] == m) {
                    nIdx++;
                }

                if(nIdx == N) {
                    idxYn = "true";
                    break;
                }
            }

            res.append(idxYn).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
