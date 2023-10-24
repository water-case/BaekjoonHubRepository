import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] charCnt = new int[26];
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            charCnt[br.readLine().toCharArray()[0]-97]++;
        }

        String res = "";
        for(int i=0; i<26; i++) {
            if(charCnt[i] >= 5) {
                res += (char)(i + 97);
            }
        }

        System.out.println(res.equals("") ? "PREDAJA" : res);
        br.close();
    }

}
