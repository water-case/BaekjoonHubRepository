import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        X = Integer.parseInt(br.readLine());
        XArr = Arrays.stream(String.valueOf(X).split(""))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        brute(0, 0, new boolean[String.valueOf(X).length()]);

        System.out.println(res == Integer.MAX_VALUE ? 0 : res);
        br.close();
    }

    private static int X;
    private static int res = Integer.MAX_VALUE;
    private static int[] XArr;

    private static void brute(int num, int cnt, boolean[] v) {
        if(num > X && cnt == XArr.length) {
            res = Math.min(res, num);
            return;
        }

        for(int i=0; i<XArr.length; i++) {
            if(!v[i]) {
                v[i] = true;
                brute(num*10 + XArr[i], cnt+1, v);
                v[i] = false;
            }
        }
    }

}
