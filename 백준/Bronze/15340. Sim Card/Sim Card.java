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
        while(!(input = br.readLine()).equals("0 0")) {
            StringTokenizer st = new StringTokenizer(input, " ");
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            int tel = c*30 + d*40;
            int cell = c*35 + d*30;
            int phone = c*40 + d*20;

            res.append(Math.min(tel, Math.min(cell, phone))).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
