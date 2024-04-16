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

        String[][] opinion = new String[N][M];
        for(int i=0; i<N; i++) {
            opinion[i] = br.readLine().split("");
        }

        int standardNum = M/2;
        int res = 0;
        label: for(int i=0; i<N; i++) {
            int cnt = 0;
            for(int j=0; j<M; j++) {
                if(opinion[i][j].equals("O")) {
                    if(cnt++>standardNum) {
                        break;
                    }
                }
            }

            if(cnt>standardNum) {
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
