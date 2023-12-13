import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cowState = new int[11];
        Arrays.fill(cowState, -1);

        int res = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int num = Integer.parseInt(st.nextToken());
            int state = Integer.parseInt(st.nextToken());
            if(cowState[num] == -1) {
                cowState[num] = state;
            } else if(cowState[num] != state) {
                res++;
                cowState[num] = state;
            }
        }

        System.out.println(res);
        br.close();
    }

}
