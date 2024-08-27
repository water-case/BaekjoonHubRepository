import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int aScore = 0, bScore = 0;

        char[] arr = br.readLine().toCharArray();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 'A') {
                aScore++;
            } else {
                bScore++;
            }
        }

        res.append(aScore).append(" : ").append(bScore);

        System.out.println(res.toString());
        br.close();
    }

}
