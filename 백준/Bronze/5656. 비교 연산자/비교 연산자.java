import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int idx = 1;
        while(true) {
            String[] sArr = br.readLine().split(" ");

            if(sArr[1].equals("E")) {
                break;
            }

            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[2]);


            boolean cal = false;
            switch (sArr[1]) {
                case ">" : cal = a>b ? true : false; break;
                case ">=": cal = a>=b ? true : false; break;
                case "<" : cal = a<b ? true : false; break;
                case "<=": cal = a<=b ? true : false; break;
                case "==": cal = a==b ? true : false; break;
                case "!=": cal = a!=b ? true : false; break;
            }

            res.append("Case ").append(idx++).append(": ").append(cal).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
