import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] cntArr = new int[3];

        for(int i=0; i<3; i++) {
            cntArr[Integer.parseInt(st.nextToken())]++;
        }

        System.out.println(cntArr[1] > cntArr[2] ? 1 : 2);
        br.close();
    }

}
