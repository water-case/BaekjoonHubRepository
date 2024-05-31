import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[4];
        for(int i=1; i<=3; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int min = Integer.MAX_VALUE;
        for(int i=1; i<=3; i++) { // 커피머신이 놓일 층
            int sum = 0;
            for(int j=1; j<=3; j++) { // 각 층별 소요시간 계산
                sum += 2*arr[j]*(Math.abs(i-j));
            }
            min = Math.min(min, sum);
        }

        System.out.println(min);
        br.close();
    }

}
