import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();

        System.out.println(s1.length() >= s2.length() ? "go" : "no");
        br.close();
    }

}
