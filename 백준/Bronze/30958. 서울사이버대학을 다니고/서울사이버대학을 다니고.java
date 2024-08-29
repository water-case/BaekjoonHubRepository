import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        char[] sArr = br.readLine().replaceAll("[ ,.]", "").toCharArray();

        int[] sCnt = new int[26];
        for(char s : sArr) {
            sCnt[s-97]++;
        }

        System.out.println(Arrays.stream(sCnt).max().getAsInt());
        br.close();
    }

}
