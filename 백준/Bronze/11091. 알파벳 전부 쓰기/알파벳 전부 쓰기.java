import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String str = br.readLine().toLowerCase().replaceAll("[^a-z]", "");
            char[] strCharArr = str.toCharArray();

            int[] cntArr = new int[26];
            for(int i=0; i<strCharArr.length; i++) {
                cntArr[strCharArr[i]-97]++;
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0; i<cntArr.length; i++) {
                if(cntArr[i] == 0) {
                    sb.append((char)(i + 97));
                }
            }
            res.append(sb.length()==0 ? "pangram" : ("missing " + sb.toString())).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
