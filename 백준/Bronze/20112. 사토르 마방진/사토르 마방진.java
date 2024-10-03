import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String res = "YES";

        int N = Integer.parseInt(br.readLine());
        char[][] map = new char[N][];
        for(int i=0; i<N; i++) {
            map[i] = br.readLine().toCharArray();
        }

label:  for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(map[i][j] != map[j][i]) {
                    res = "NO";
                    break label;
                }
            }
        }

        System.out.println(res);
        br.close();
    }

}
