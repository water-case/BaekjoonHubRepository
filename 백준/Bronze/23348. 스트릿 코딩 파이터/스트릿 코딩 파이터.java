import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] ABC = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int res = 0;

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            int n = 3;

            int cal = 0;
            while(n-->0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");

                for(int i=0; i<3; i++) {
                    cal += Integer.parseInt(st.nextToken()) * (ABC[i]);
                }
            }

            res = Math.max(res, cal);
        }

        System.out.println(res);
        br.close();
    }

}
