import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++) {
            String mark = "*";
            for(int j=0; j<M; j++) {
                if(j==0) {
                    mark = i%2==0 ? "*" : ".";
                } else {
                    mark = mark.equals("*") ? "." : "*";
                }

                res.append(mark);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
