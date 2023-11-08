import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int cal = 0;
            cal += calc(a, Year.Y2017.ordinal());
            cal += calc(b, Year.Y2018.ordinal());

            res.append(cal).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    enum Year {
        Y2017, Y2018
    }

    static int[][] person = {
            {1,2,3,4,5,6},
            {1,2,4,8,16}
    };
    static int[][] reward = {
            {500, 300, 200, 50, 30, 10},
            {512,256,128,64,32}
    };

    static int calc(int rank, int idx) {
        int res = 0;

        if(rank<=0) {
            return res;
        }

        for(int i=0; i<person[idx].length; i++) {
            rank -= person[idx][i];
            if(rank<=0) {
                res += reward[idx][i] * 10_000;
                break;
            }
        }

        return res;
    }
}
