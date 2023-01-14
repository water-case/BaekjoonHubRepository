import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        solve(br);

        br.close();
    }

    static String res;

    private static void solve(BufferedReader br) throws Exception {

        String s;
        while((s = br.readLine()) != null) {
            System.out.println(s);
        }

    }

}
