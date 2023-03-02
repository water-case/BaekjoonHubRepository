import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        res = 1;
        word = br.readLine().split("");

        br.close();
    }

    static int res;
    static String[] word;

    private static void solve() {
        for(int i=0; i<word.length/2; i++) {
            if(!word[i].equals(word[word.length-i-1])) {
                 res = 0;
            }
        }

        System.out.println(res);
    }

}
