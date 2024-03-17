import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] calc = new int[3];
        for(int i=0; i<=N; i++) {
            calc[0] += i;
            calc[1] += i;
            calc[2] += Math.pow(i, 3);
        }
        calc[1] = (int) Math.pow(calc[1], 2);

        StringBuilder res = new StringBuilder();
        for(int i=0; i<3; i++) {
            res.append(calc[i]).append("\n");
        }
        System.out.println(res.toString());
        br.close();
    }

}
