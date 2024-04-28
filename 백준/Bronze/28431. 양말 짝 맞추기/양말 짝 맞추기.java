import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] nArr = new int[10];
        int cnt = 5;
        while(cnt-->0) {
            int num = Integer.parseInt(br.readLine());
            if(nArr[num] == 0) {
                nArr[num]++;
            } else {
                nArr[num]--;
            }
        }

        int res = 0;
        for(int i=0; i<nArr.length; i++) {
            if(nArr[i] != 0) {
                res = i;
            }
        }

        System.out.println(res);
        br.close();
    }

}
