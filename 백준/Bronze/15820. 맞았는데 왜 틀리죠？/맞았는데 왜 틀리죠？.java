import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s1 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        boolean sample = true, system = true;
        while(s1-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            int ans = Integer.parseInt(st.nextToken());
            int make = Integer.parseInt(st.nextToken());

            if(ans != make) {
                sample = false;
                break;
            }
        }

        while(s2-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            int ans = Integer.parseInt(st.nextToken());
            int make = Integer.parseInt(st.nextToken());

            if(ans != make) {
                system = false;
                break;
            }
        }

        System.out.println(sample&&system ? "Accepted" : sample&&!system ? "Why Wrong!!!" : "Wrong Answer");
        br.close();
    }

}
