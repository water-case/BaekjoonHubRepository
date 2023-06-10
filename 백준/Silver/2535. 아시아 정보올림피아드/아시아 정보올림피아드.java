import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        sArr = new int[N][3];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sArr[i][0] = Integer.parseInt(st.nextToken());
            sArr[i][1] = Integer.parseInt(st.nextToken());
            sArr[i][2] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int N, sArr[][];

    private static void solve() {
        StringBuilder res = new StringBuilder();

        Arrays.sort(sArr, (o1, o2) -> -Integer.compare(o1[2], o2[2]));
        res.append(sArr[0][0]).append(" ").append(sArr[0][1]).append("\n");
        res.append(sArr[1][0]).append(" ").append(sArr[1][1]).append("\n");
        for(int i=2; i<N; i++) {
            if(sArr[0][0] == sArr[1][0] && sArr[0][0] == sArr[i][0]) {
                continue;
            }
            res.append(sArr[i][0]).append(" ").append(sArr[i][1]);
            break;
        }

        System.out.println(res.toString());
    }

}
