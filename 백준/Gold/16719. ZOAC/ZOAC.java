import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        cArr = br.readLine().toCharArray();
        idxArr = new int[cArr.length];

        calIdx(0, cArr.length-1, 'A');

        StringBuilder res = new StringBuilder();
        for(int i=1; i<=cArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<cArr.length; j++) {
                if(i >= idxArr[j]) {
                    sb.append(cArr[j]);
                }
            }
            res.append(sb).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    static int idx = 1;
    static char[] cArr;
    static int[] idxArr;

    static void calIdx(int start, int end, char c) {
        for(int i=c-65; i<26; i++) {
            for(int j=start; j<=end; j++) {
                if(cArr[j] == (char)(i+65) && idxArr[j] == 0) {
                    idxArr[j] = idx++;
                    calIdx(j+1, end, (char)(i+65));
                    calIdx(start, j-1, (char)(i+65));
                }
            }
        }
    }

}
