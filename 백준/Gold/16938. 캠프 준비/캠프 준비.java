import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken()); // 문제수
        L = Integer.parseInt(st.nextToken()); // 난이도 합 최소치
        R = Integer.parseInt(st.nextToken()); // 난이도 합 최대치
        X = Integer.parseInt(st.nextToken()); // 문제간 난이도 차이

        levels = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        brute(0, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);

        System.out.println(res);
        br.close();
    }

    static int N, L, R, X, res;
    static int[] levels;

    private static void brute(int idx, int cnt, int sum, int max, int min) {
        if(sum > R) {
            return;
        }

        if(idx == N) {
            if(cnt >= 2 && sum >= L && max - min >= X) {
                res++;
            }
            return;
        }

        brute(idx+1, cnt, sum, max, min);
        brute(idx+1, cnt+1, sum + levels[idx], Math.max(max, levels[idx]), Math.min(min, levels[idx]));
    }

}
