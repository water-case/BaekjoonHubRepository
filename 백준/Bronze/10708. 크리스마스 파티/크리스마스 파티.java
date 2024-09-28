import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 친구들의 수
        int[] scoreArr = new int[N];

        int M = Integer.parseInt(br.readLine()); // 게임의 횟수
        int[] targetMap = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        int idx = 0;
        while(M-->0) {
            int targetNum = targetMap[idx++];

            int[] paperMap = Arrays.stream(br.readLine().split(" "))
                                    .mapToInt(Integer::parseInt)
                                    .toArray();

            for(int i=0; i<N; i++) {
                if(paperMap[i] == targetNum) {
                    scoreArr[i]++;
                } else {
                    scoreArr[targetNum-1]++;
                }
            }
        }

        for(int score : scoreArr) {
            res.append(score).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
