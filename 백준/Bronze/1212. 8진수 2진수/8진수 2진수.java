import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    private static void init(BufferedReader br) throws Exception {
        res = "";
        input = br.readLine().toCharArray();
    }

    static String res;
    static char[] input;
    static String[] str = {"000", "001", "010", "011", "100", "101", "110", "111"};

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        if(input.length == 1 && input[0] == '0') {
            res = "0";
            return;
        }

        boolean start = true;
        for(char c : input) {
            int num = c - '0';

            if(start && num<4) {
                if(num == 0) {
                    continue;
                } else if(num == 1) {
                    sb.append("1");
                } else if(num == 2) {
                    sb.append("10");
                } else if(num == 3) {
                    sb.append("11");
                }
            } else {
                sb.append(str[num]);
            }

            if(start) {
                start = false;
            }
        }

        res = sb.toString();
    }

}
