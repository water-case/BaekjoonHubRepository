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
            char[][] wordArr = new char[2][];
            wordArr[0] = st.nextToken().toCharArray();
            wordArr[1] = st.nextToken().toCharArray();

            res.append("Distances: ");
            for(int i=0; i<wordArr[0].length; i++) {
                int cal = wordArr[1][i] - wordArr[0][i];
                res.append(cal<0 ? cal+26 : cal)
                    .append(" ");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
