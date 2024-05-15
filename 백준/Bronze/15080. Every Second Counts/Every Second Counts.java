import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " : ");
        int time1 = 3600 * Integer.parseInt(st.nextToken()) + 60 * Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " : ");
        int time2 = 3600 * Integer.parseInt(st.nextToken()) + 60 * Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

        if(time1 > time2) {
            time2 += 3600*24;
        }
        System.out.println(time2 - time1);
        br.close();
    }

}
