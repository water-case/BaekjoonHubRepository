import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        int idx = 1;
        while(N-->0) {
            res.append("Hello World, Judge ").append(idx++).append("!").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
