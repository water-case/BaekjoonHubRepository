import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        str = br.readLine().split("");
        
        br.close();
    }

    static String[] str;

    private static void solve() {
        int res = 0;
        int val = 1;

        Stack<String> stack = new Stack<>();
        for(int i=0; i<str.length; i++) {
            if(isStartBracket(str[i])) {
                stack.push(str[i]);
                val *= str[i].equals("(") ? 2 : 3;
            } else {
                if(")".equals(str[i])) {
                    if(stack.isEmpty() || !stack.peek().equals("(")) {
                        res = 0;
                        break;
                    } else if(str[i-1].equals("(")) {
                        res += val;
                    }
                    stack.pop();
                    val /= 2;
                } else {
                    if(stack.isEmpty() || !stack.peek().equals("[")) {
                        res = 0;
                        break;
                    } else if(str[i-1].equals("[")) {
                        res += val;
                    }
                    stack.pop();
                    val /= 3;
                }
            }
        }

        if(!stack.isEmpty()) {
            res = 0;
        }

        System.out.println(res);
    }

    private static boolean isStartBracket(String s) {
        switch (s) {
            case "(" :
            case "[" :
                return true;
            default:
                return false;
        }
    }

}
