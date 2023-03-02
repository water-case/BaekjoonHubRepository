import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        res = "";
        word = br.readLine().toCharArray();

        br.close();
    }

    static String res;
    static char[] word;

    private static void solve() {
        for(char c : word) {
            if(c>=65 && c<97) {
                res += c;
            }
        }

        System.out.println(res);
    }

}
