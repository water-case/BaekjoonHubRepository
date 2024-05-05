import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nArr = new int[4];
        for(int i=0; i<4; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        String res = "ignore";
        if(nArr[0]<8 || nArr[3]<8 || nArr[1] != nArr[2]) {
            res = "answer";
        }

        System.out.println(res);
        br.close();
    }

}
