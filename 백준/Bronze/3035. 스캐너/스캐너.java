import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int ZR = Integer.parseInt(st.nextToken());
        int ZC = Integer.parseInt(st.nextToken());

        char[][] map = new char[R][C];
        for(int i=0; i<R; i++) {
            map[i] = br.readLine().toCharArray();
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<R; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<C; j++) {
                for(int k=0; k<ZC; k++) {
                    sb.append(map[i][j]);
                }
            }

            for(int j=0; j<ZR; j++) {
                res.append(sb).append("\n");
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
