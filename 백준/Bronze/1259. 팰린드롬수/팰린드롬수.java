import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static String res;
    static List<Integer> nList;

    private static void solve() {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<nList.size(); i++) {
            int num = nList.get(i);
            int tmp = num;
            int cal = 0;

            while(tmp != 0) {
                cal *= 10;
                cal += tmp%10;
                tmp /= 10;
            }

            sb.append(num==cal ? "yes" : "no").append("\n");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        nList = new ArrayList<>();
        while(true) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                break;
            }
            nList.add(num);
        }
    }

}
