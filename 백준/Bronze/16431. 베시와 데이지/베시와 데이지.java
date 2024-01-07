import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] bdj = new int[3][2];

        for(int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for(int j=0; j<2; j++) {
                bdj[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int bessie = Math.max(Math.abs(bdj[2][0]-bdj[0][0]), Math.abs(bdj[2][1]-bdj[0][1]));
        int daisy =  Math.abs(bdj[2][0]-bdj[1][0]) + Math.abs(bdj[2][1]-bdj[1][1]);

        String res = "";
        if(bessie == daisy) {
            res = "tie";
        } else if(bessie > daisy) {
            res = "daisy";
        } else {
            res = "bessie";
        }

        System.out.println(res);
        br.close();
    }

}
