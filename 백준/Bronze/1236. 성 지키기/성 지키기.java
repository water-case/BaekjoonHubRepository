import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] map = new char[N][];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int rowCnt = 0;
        label: for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(map[i][j] == 'X') {
                    continue label;
                }
            }
            rowCnt++;
        }

        int colCnt = 0;
        label: for(int j=0; j<M; j++) {
            for(int i=0; i<N; i++) {
                if(map[i][j] == 'X') {
                    continue label;
                }
            }
            colCnt++;
        }

        System.out.println(Math.max(rowCnt, colCnt));
        br.close();
    }

}
