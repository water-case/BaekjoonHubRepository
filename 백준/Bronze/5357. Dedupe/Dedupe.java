import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            String rmDuplStr = rmDuplication(br.readLine());

            res.append(rmDuplStr).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static String rmDuplication(String str) {
        String res = "";

        String[] sArr = str.split("");
        String now = "";

        for(String c : sArr) {
            if(!c.equals(now)) {
                res += c;
                now = c;
            }
        }

        return res;
    }

}
