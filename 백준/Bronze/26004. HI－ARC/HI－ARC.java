import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] cArr = br.readLine().toCharArray();

        int[] cntArr = new int[5];
        for(int i=0; i<cArr.length; i++) {
            switch (cArr[i]) {
                case 'H' : cntArr[0]++; break;
                case 'I' : cntArr[1]++; break;
                case 'A' : cntArr[2]++; break;
                case 'R' : cntArr[3]++; break;
                case 'C' : cntArr[4]++; break;
            }
        }

        int res = Integer.MAX_VALUE;
        for(int cnt : cntArr) {
            res = Math.min(cnt, res);
        }

        System.out.println(res);
        br.close();
    }

}
