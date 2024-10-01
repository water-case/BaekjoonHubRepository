import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        while(!(input=br.readLine()).equals("#")) {

            int cal = 0;
            char[] cArr = input.toCharArray();

            for(int i=0; i<cArr.length; i++) {
                if(cArr[i] == ' ') continue;
                cal += ((int)cArr[i]-64) * (i+1);
            }

            res.append(cal).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
