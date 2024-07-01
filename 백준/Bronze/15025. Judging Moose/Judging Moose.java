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
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        if(l==0 && r==0) {
            res.append("Not a moose");
        } else if(l!=r) {
            res.append("Odd ").append(Math.max(l, r) * 2);
        } else {
            res.append("Even ").append(l*2);
        }

        System.out.println(res.toString());
        br.close();
    }

}
