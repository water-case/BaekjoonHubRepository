import java.io.*;
import java.util.*;

public class Main {

    private static final int NUM_SIZE = 8;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = "";
        String num1 = br.readLine();
        String num2 = br.readLine();

        for(int i=0; i<NUM_SIZE; i++) {
            num += num1.charAt(i)-48;
            num += num2.charAt(i)-48;
        }

        String res = "";
        for(int i=0; i<14; i++) {
            res = "";

            for(int j=0; j<num.length()-1; j++) {
                res += ((num.charAt(j)-48) + (num.charAt(j+1)-48)) % 10;
            }

            num = res;
        }

        System.out.println(res);
        br.close();
    }

}
