import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] alphaCnt = new int[27];
        char[] cArr1 = br.readLine().toCharArray();
        char[] cArr2 = br.readLine().toCharArray();

        for(int i=0; i<cArr1.length; i++) {
            alphaCnt[cArr1[i]-97]++;
        }
        for(int i=0; i<cArr2.length; i++) {
            alphaCnt[cArr2[i]-97]--;
        }

        int res = 0;
        for(int cnt : alphaCnt) {
            res += Math.abs(cnt);
        }
        System.out.println(res);
        br.close();
    }

}
