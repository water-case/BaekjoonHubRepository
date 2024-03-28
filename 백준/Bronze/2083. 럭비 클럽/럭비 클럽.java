import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input = br.readLine()).equals("# 0 0")) {
            StringTokenizer st = new StringTokenizer(input, " ");
            String name = st.nextToken();
            int age = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            String str = "";
            if(age>17 || weight>=80) {
                str = "Senior";
            } else {
                str = "Junior";
            }

            res.append(name)
                .append(" ")
                .append(str)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
