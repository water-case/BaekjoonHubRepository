import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if("END".equals(str)) {
                break;
            }

            res.append(new StringBuilder(str).reverse()).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
