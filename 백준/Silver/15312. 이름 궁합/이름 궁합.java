import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cntArr = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        int[][] name = new int[2][];

        for(int i=0; i<2; i++) {
            char[] cname = br.readLine().toCharArray();
            name[i] = new int[cname.length];
            for(int j=0; j<cname.length; j++) {
                name[i][j] = cntArr[cname[j]-'A'];
            }
        }

        expression = new int[name[0].length + name[1].length];
        for(int i=0; i<2; i++) {
            for(int j=0; j<name[i].length; j++) {
                expression[j*2 + i] = name[i][j];
            }
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int[] expression;

    private static void solve() {

        int size = expression.length-2;

        for(int i=0; i<size; i++) {

            int[] temp = new int[expression.length-1];

            for(int j=0; j<temp.length; j++) {
                temp[j] = (expression[j] + expression[j+1]) % 10;
            }

            expression = temp;
        }


        System.out.println(expression[0] + "" + expression[1]);
    }

}
