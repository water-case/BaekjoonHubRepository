import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;

        int ham = Integer.MAX_VALUE;
        for(int i=0; i<3; i++) {
            ham = Math.min(ham, Integer.parseInt(br.readLine()));
        }

        int bever = Integer.MAX_VALUE;
        for(int i=0; i<2; i++) {
            bever = Math.min(bever, Integer.parseInt(br.readLine()));
        }

        System.out.println(ham + bever - 50);
        br.close();
    }

}
