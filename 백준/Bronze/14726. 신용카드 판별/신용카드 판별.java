import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            String cardNum = br.readLine();

            int sum = 0;
            for(int i=0 ;i<cardNum.length(); i++) {
                int iNum = Integer.parseInt(String.valueOf(cardNum.charAt(cardNum.length()-i-1)));
                if((i+1)%2 == 0) {
                    int tmp = iNum * 2;
                    sum += tmp >= 10 ? tmp-9 : tmp;
                } else {
                    sum += iNum;
                }
            }

            res.append(sum%10 == 0 ? "T" : "F")
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
