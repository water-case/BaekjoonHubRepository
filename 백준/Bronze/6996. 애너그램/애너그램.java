import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            String[] sArr = br.readLine().split(" ");

            res.append(sArr[0] + " & " + sArr[1] + chkAnagrams(sArr)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static String chkAnagrams(String[] sArr) {
        String str1 = Arrays.stream(sArr[0].split(""))
                .sorted()
                .collect(Collectors.joining());

        String str2 = Arrays.stream(sArr[1].split(""))
                .sorted()
                .collect(Collectors.joining());

        return str1.equals(str2) ? " are anagrams." : " are NOT anagrams.";
    }

}
