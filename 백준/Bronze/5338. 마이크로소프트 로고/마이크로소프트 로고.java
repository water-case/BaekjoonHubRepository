import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        solve();

        System.out.println(res);
    }

    static String res;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        sb.append("       _.-;;-._").append("\n");
        sb.append("'-..-'|   ||   |").append("\n");
        sb.append("'-..-'|_.-;;-._|").append("\n");
        sb.append("'-..-'|   ||   |").append("\n");
        sb.append("'-..-'|_.-''-._|").append("\n");

        res = sb.toString();
    }

}
