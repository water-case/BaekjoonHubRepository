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
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] nArr = new int[N];
        for(int i=0; i<N; i++) {
            nArr[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1; i<=M; i++) {
            for(int j=0; j<N-1; j++) {
                if(nArr[j]%i > nArr[j+1]%i) {
                    int tmp = nArr[j];
                    nArr[j] = nArr[j+1];
                    nArr[j+1] = tmp;
                }
            }
        }

        for(int n : nArr) {
            res.append(n).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
