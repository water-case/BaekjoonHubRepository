import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        Set<String> pwSet = new HashSet<>();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String pw = br.readLine();

            pwSet.add(pw);

            StringBuilder pwsb = new StringBuilder(pw);
            if(pwSet.contains(pwsb.reverse().toString())) {
                res.append(pw.length()).append(" ").append(pw.charAt(pw.length()/2));
            }
        }

        System.out.print(res.toString());
        br.close();
    }

}
