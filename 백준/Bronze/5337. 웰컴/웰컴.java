import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        solve();

        System.out.println(res);
        br.close();
    }

    static String res;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append(".  .   .\n")
          .append("|  | _ | _. _ ._ _  _\n")
          .append("|/\\|(/.|(_.(_)[ | )(/.\n");

        res = sb.toString();
    }

}
