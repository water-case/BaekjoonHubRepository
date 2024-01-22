import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] psResult = br.readLine().split("");
        int res = 0;
        int bonus = 0;
        for(int i=0; i<N; i++) {
            if(psResult[i].equals("O")) {
                res += i+1 + bonus;
                bonus++;
            } else {
                bonus = 0;
            }
        }

        System.out.println(res);
        br.close();
    }

}
