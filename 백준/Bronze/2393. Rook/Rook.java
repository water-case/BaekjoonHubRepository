import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();
        res.append("  ___  ___  ___").append("\n")
            .append("  | |__| |__| |").append("\n")
            .append("  |           |").append("\n")
            .append("   \\_________/").append("\n")
            .append("    \\_______/").append("\n")
            .append("     |     |").append("\n")
            .append("     |     |").append("\n")
            .append("     |     |").append("\n")
            .append("     |     |").append("\n")
            .append("     |_____|").append("\n")
            .append("  __/       \\__").append("\n")
            .append(" /             \\").append("\n")
            .append("/_______________\\").append("\n");


        System.out.println(res.toString());
        br.close();
    }

}
