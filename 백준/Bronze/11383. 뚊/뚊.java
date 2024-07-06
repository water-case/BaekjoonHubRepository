import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][M];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        boolean eyfa = true;
        for(int i=0; i<N; i++) {
            String str = "";
            for(int j=0; j<M; j++) {
                str += String.valueOf(map[i][j]) + String.valueOf(map[i][j]);
            }

            if(!br.readLine().equals(str)) {
                eyfa = false;
                break;
            }
        }

        System.out.println(eyfa ? "Eyfa" : "Not Eyfa");
        br.close();
    }

}
