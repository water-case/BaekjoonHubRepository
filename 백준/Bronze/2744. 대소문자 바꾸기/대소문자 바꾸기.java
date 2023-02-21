import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static String res;
    static char[] word;

    private static void solve() {
        char tmp;
        for(char c : word) {
            if(c>=97) {
                tmp = (char) (c-32);
            } else {
                tmp = (char) (c+32);
            }
            res+=tmp;
        }
    }

    private static void init(BufferedReader br) throws Exception {
        res = "";
        word = br.readLine().toCharArray();
    }

}
