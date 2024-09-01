import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int P = Integer.parseInt(br.readLine());
        int[] cArr = new int[4];
        while(P-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            if(Integer.parseInt(st.nextToken()) == 1) {
                cArr[3]++;
                continue;
            }

            switch (Integer.parseInt(st.nextToken())) {
                case 1:
                case 2: cArr[0]++; break;
                case 3: cArr[1]++; break;
                case 4: cArr[2]++; break;
            }
        }

        for(int c : cArr) {
            res.append(c).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
