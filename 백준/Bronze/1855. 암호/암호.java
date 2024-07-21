import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int K = Integer.parseInt(br.readLine());
        char[] cArr = br.readLine().toCharArray();
        int row = cArr.length/K;

        char[][] map = new char[row][K];
        for(int i=0; i<map.length; i++) {
            for(int j=0; j<map[i].length; j++) {
                map[i][j] = i%2==0 ?
                                cArr[i*K + j]
                                :
                                cArr[(i+1)*K - j - 1];
            }
        }

        for(int i=0; i<map[0].length; i++) {
            for(int j=0; j<map.length; j++) {
                res.append(map[j][i]);
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
