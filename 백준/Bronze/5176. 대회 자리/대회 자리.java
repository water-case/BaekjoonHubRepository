import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        while(K-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int P = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Set<Integer> dupSet = new HashSet<>();
            int resCnt = 0;
            while(P-->0) {
                int pos = Integer.parseInt(br.readLine());
                if(dupSet.contains(pos)) {
                    resCnt++;
                } else {
                    dupSet.add(pos);
                }
            }

            res.append(resCnt)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
