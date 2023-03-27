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
        StringBuilder res = new StringBuilder(), s = new StringBuilder();
        boolean passCheck = false;

        for(int i=0; i<str.length; i++) {
            if(passCheck) {
                s.append(str[i]);
                if(str[i] =='>') {
                    passCheck = false;
                    res.append(s);
                    s = new StringBuilder();
                }
                continue;
            }

            if(str[i] == '<') {
                if(!s.equals("")) {
                    res.append(s.reverse());
                    s = new StringBuilder();
                }

                passCheck = true;
                s.append(str[i]);
                continue;
            }

            if(str[i] == ' ') {
                res.append(s.reverse()).append(" ");
                s = new StringBuilder();
            } else {
                s.append(str[i]);
            }
        }

        if(!s.equals("")) {
            res.append(s.reverse()).append(" ");
        }

        System.out.println(res);
    }

}
