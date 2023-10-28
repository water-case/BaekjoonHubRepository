import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N*2 - 1; i++) {
            recursion(i);
        }

        for(StringBuilder sb : res) {
            System.out.println(sb.toString());
        }
        br.close();
    }

    static List<StringBuilder> res = new ArrayList<>();

    private static void recursion(int n) {
        if(n==1) {
            res.add(new StringBuilder("*"));
            return;
        }

        String str = n%2!=0 ? "*" : " ";
        for(int i=0; i<res.size(); i++) {
            StringBuilder now = res.get(i);
            now.append(str).reverse().append(str);
        }

        res.add(0, getLine(n*2-1, str));
        res.add(getLine(n*2-1, str));
    }

    private static StringBuilder getLine(int n, String str) {
        StringBuilder addSb = new StringBuilder();
        for(int j=0; j<n; j++) {
            addSb.append(str);
        }
        return addSb;

    }

}
