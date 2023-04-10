import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().toCharArray();

        br.close();
    }

    static char[] str;

    private static void solve() {
        StringBuilder sb = new StringBuilder();
        for(char c : str) {
            if(c>=65 && c<=90) {
                sb.append((char) ((c-65+13)%26 +65));
            } else if(c>=97 && c<=122) {
                sb.append((char) ((c-97+13)%26 +97));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

}
