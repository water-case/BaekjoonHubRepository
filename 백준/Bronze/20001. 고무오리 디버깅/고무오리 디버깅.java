import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();

        String input = "";
        int solveCnt = 0;
        while(!(input = br.readLine()).equals("고무오리 디버깅 끝")) {
            solveCnt += input.equals("문제") ? 1 : 0;

            if(input.equals("고무오리")) {
                solveCnt += !(solveCnt>0) ? 2 : -1;
            }
        }

        System.out.println(solveCnt==0 ? "고무오리야 사랑해" : "힝구");
        br.close();
    }

}
