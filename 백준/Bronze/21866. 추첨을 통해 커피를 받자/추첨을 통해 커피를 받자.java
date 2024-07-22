import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int[] MAX_SCR_ARR = {100, 100, 200, 200, 300, 300, 400, 400, 500};

        int[] scrArr = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int sum = 0;
        boolean isHacker = false;

        for(int i=0; i<MAX_SCR_ARR.length; i++) {

            if(scrArr[i]>MAX_SCR_ARR[i]) {
                isHacker = true;
                break;
            }

            sum += scrArr[i];
        }

        System.out.println(isHacker ? "hacker" : sum>=100 ? "draw" : "none");
        br.close();
    }

}
