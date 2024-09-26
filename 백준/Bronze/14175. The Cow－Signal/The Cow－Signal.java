import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[][] originMap = new char[M][];
        for(int i=0; i<M; i++) {
            originMap[i] = br.readLine().toCharArray();
        }

        for(int i=0; i<M; i++) {
            for(int j=0; j<K; j++) {
                for(int k=0; k<N; k++) {
                    for(int l=0; l<K; l++) {
                        res.append(originMap[i][k]);
                    }
                }
                res.append("\n");
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
