import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String str = "";
        int idx = 1;
        while(!(str = br.readLine()).equals("0")) {
            res.append("Case ").append(idx++).append(": Sorting... done!").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
