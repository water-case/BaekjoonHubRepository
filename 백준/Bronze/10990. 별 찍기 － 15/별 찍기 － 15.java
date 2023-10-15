import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        // 꼭지점
        for(int i=0; i<N-1; i++) {
            res.append(" ");
        }
        res.append("*").append("\n");

        for(int i=1; i<N; i++) {
            for(int j=0; j<N-i-1; j++) {
                res.append(" ");
            }
            res.append("*");
            for(int j=0; j<2*i-1; j++) {
                res.append(" ");
            }
            res.append("*").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
