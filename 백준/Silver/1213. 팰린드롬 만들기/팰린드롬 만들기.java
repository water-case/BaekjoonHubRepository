import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cnt = new int[26];

        char[] inputArr = br.readLine().toCharArray();
        for(int i=0; i<inputArr.length; i++) {
            cnt[inputArr[i]-65]++;
        }

        String res = "";

        boolean chk = false, success = true;
        String oddStr = "";
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i]%2!=0) {
                if(chk) {
                    res = "I'm Sorry Hansoo";
                    success = false;
                    break;
                }
                chk = true;
                oddStr = String.valueOf((char)(i+65));
            }
        }

        if(success) {
            for(int i=0; i<cnt.length; i++) {
                if(cnt[i]>=2) {
                    for(int j=0; j<cnt[i]/2; j++) {
                        res += String.valueOf((char)(i+65));
                    }
                }
            }

            res = res + oddStr + new StringBuilder(res).reverse().toString();
        }

        System.out.println(res);
        br.close();
    }

}
