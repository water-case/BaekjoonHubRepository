import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        int M = Integer.parseInt(br.readLine());
        int res = 0;
        while(M-->0) {
            res += nArr[Integer.parseInt(br.readLine())-1];
        }

        System.out.println(res);
        br.close();
    }

}
