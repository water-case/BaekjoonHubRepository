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
        sb.append("     /~\\").append("\n")
          .append("    ( oo|").append("\n")
          .append("    _\\=/_").append("\n")
          .append("   /  _  \\").append("\n")
          .append("  //|/.\\|\\\\").append("\n")
          .append(" ||  \\ /  ||").append("\n")
          .append("============").append("\n")
          .append("|          |").append("\n")
          .append("|          |").append("\n")
          .append("|          |").append("\n");

        res = sb.toString();
    }

}
