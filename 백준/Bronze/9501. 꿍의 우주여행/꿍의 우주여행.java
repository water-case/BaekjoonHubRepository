import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int N = Integer.parseInt(st.nextToken()); // 우주선의 개수
            int D = Integer.parseInt(st.nextToken()); // 목적지까지의 거리

            int cnt = 0;
            while(N-->0) {
                st = new StringTokenizer(br.readLine(), " ");
                int v = Integer.parseInt(st.nextToken()); // 최고속도
                int f = Integer.parseInt(st.nextToken()); // 연료양
                int c = Integer.parseInt(st.nextToken()); // 연료소비율

                double length = v * ((double)f/c);
                if(length >= D) {
                    cnt++;
                }
            }

            res.append(cnt)
               .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
