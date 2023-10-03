import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr = br.readLine().split("");

        String pre = "";
        int res = 0;
        for(String str : sArr) {
            res += pre.equals(str) ? 5 : 10;
            pre = str;
        }

        System.out.println(res);
        br.close();
    }

}
