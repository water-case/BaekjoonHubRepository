import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 다음달에 사용할 휘발유의 양
        int k = Integer.parseInt(br.readLine()); // 남은 할당량

        // 다음달 할당량
        k += 60;

        int res = 0;
        // 할당량보다 주유해야할 양이 크다면
        if(n>k) {
            res += (1500 * k) + (3000 * (n-k));
        } else {
            res += (1500 * n);
        }

        System.out.println(res);
        br.close();
    }

}
