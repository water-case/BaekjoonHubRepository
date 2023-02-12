import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static String res;
    static List<int[]> yuts;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int[] ia : yuts) {
            int zero = 0;
            for(int i : ia) {
                if(i==0) {
                    zero++;
                }
            }

            String status = "";
            switch (zero) {
                case 0:
                    status = "E";
                    break;
                case 1:
                    status = "A";
                    break;
                case 2:
                    status = "B";
                    break;
                case 3:
                    status = "C";
                    break;
                case 4:
                    status = "D";
                    break;
            }
            sb.append(status).append("\n");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        res = "";
        yuts = new ArrayList<>();

        for(int i=0; i<3; i++) {
            String[] sa = br.readLine().split(" ");
            int[] yut = new int[4];

            for(int j=0; j<4; j++) {
                yut[j] = Integer.parseInt(sa[j]);
            }

            yuts.add(yut);
        }
    }

}
