import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        word = br.readLine();

        br.close();
    }

    static String word;

    private static void solve() {
        long res = Arrays.stream(word.split(""))
                .filter(s -> {
                    switch(s) {
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            return true;
                        default:
                            return false;
                    }
                })
                .count();

        System.out.println(res);
    }

}
