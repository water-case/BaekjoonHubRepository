import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] sum = new int[2];
        for(int i=0; i<2; i++) {
            for(int j=3; j>0; j--) {
                sum[i] += j*Integer.parseInt(br.readLine());
            }
        }

        System.out.println(sum[0] > sum[1] ? "A" : sum[0] == sum[1] ? "T" : "B");
        br.close();
    }

}
