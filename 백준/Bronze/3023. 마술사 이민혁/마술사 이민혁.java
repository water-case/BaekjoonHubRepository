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
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        String[] sArr = new String[R*2];
        for(int i=0; i<R; i++) {
            sArr[i] = br.readLine();
            sArr[i] += new StringBuilder(sArr[i]).reverse();
        }

        for(int i=0; i<R; i++) {
            sArr[R+i] = sArr[R-i-1];
        }

        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken())-1;
        int B = Integer.parseInt(st.nextToken())-1;

        sArr[A] = sArr[A].substring(0, B) + String.valueOf(sArr[A].charAt(B)=='#' ? '.' : '#') + sArr[A].substring(B+1);

        for(int i=0; i<R*2; i++) {
            res.append(sArr[i]).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
