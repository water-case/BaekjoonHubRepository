import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = 0;
        while(n++ < 5) {
            if(br.readLine().contains("FBI")) {
                res.append(n)
                    .append(" ");
            }
        }

        if(res.length() == 0) {
            res.append("HE GOT AWAY!");
        }

        System.out.println(res.toString());
        br.close();
    }

}
