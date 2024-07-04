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
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        for(int i=0; i<R*A; i++) {
            for(int j=0; j<C*B; j++) {

                if(((i/A)%2==0 && ((j/B)%2==0)) || ((i/A)%2!=0 && ((j/B)%2!=0))) {
                    res.append("X");
                } else {
                    res.append(".");
                }

            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
