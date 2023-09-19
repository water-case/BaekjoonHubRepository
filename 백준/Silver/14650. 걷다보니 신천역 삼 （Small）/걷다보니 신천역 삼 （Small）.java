import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        brute(1, "1");
        brute(1, "2");

        System.out.println(res);
        br.close();
    }

    static int N, res;
    static String[] numArr = {"0", "1", "2"};

    private static void brute(int cnt, String num) {

        if(cnt == N) {
            if(Integer.parseInt(num) % 3 == 0) {
                res++;
            }
            return;
        }

        for(int i=0; i<3; i++) {
            brute(cnt+1, num+numArr[i]);
        }
    }

}
