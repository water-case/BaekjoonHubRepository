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
        while(!(input = br.readLine()).equals("0")) {
            StringTokenizer st = new StringTokenizer(input);

            int N = Integer.parseInt(st.nextToken());


            int tmp = Integer.parseInt(st.nextToken());
            res.append(tmp).append(" ");

            for(int i=1; i<N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(tmp != num) {
                    res.append(num).append(" ");
                    tmp = num;
                }
            }

            res.append("$")
               .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
