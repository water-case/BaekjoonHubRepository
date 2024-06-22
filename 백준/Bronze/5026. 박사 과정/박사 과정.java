import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String str = br.readLine();

            if(str.equals("P=NP")) {
                res.append("skipped")
                    .append("\n");
                continue;
            }

            String[] sArr = str.split("[+]");
            res.append(Integer.parseInt(sArr[0]) + Integer.parseInt(sArr[1]))
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
