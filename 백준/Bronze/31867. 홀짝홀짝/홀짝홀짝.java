import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] kArr = Arrays.stream(br.readLine().split(""))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int oddCnt = 0, evenCnt = 0;
        for(int i=0; i<N; i++) {
            if(kArr[i]%2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        int res = oddCnt==evenCnt ? -1 :
                                        oddCnt > evenCnt ? 1 : 0 ;

        System.out.println(res);
        br.close();
    }

}
