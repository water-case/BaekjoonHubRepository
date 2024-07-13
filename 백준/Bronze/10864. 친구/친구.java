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

        int[] cntArr = new int[N];
        while(M-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            cntArr[Integer.parseInt(st.nextToken())-1]++;
            cntArr[Integer.parseInt(st.nextToken())-1]++;
        }

        for(int i : cntArr) {
            res.append(i)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
