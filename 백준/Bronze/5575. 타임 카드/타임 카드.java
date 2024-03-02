import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startTime = 3600 * Integer.parseInt(st.nextToken());
            startTime += 60 * Integer.parseInt(st.nextToken());
            startTime += Integer.parseInt(st.nextToken());

            int endTime = 3600 * Integer.parseInt(st.nextToken());
            endTime += 60 * Integer.parseInt(st.nextToken());
            endTime += Integer.parseInt(st.nextToken());

            int diff = endTime - startTime;

            res.append(diff/(60*60)).append(" ")
                .append((diff/60)%60).append(" ")
                .append(diff%60).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
