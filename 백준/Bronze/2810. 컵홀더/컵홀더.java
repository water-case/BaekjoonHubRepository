import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int coupleCnt = N - br.readLine().replaceAll("LL", "L").length();

        System.out.println(coupleCnt <= 1 ? N : N - coupleCnt + 1);
        br.close();
    }

}
