import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String str = br.readLine();
            res.append(str.substring(0, 1).toUpperCase())
                    .append(str.substring(1, str.length()))
                    .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
