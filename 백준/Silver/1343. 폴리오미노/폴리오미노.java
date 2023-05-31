import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        xNum = new ArrayList<>();

        String[] split = br.readLine().split("");

        int size = 0;
        for(int i=0; i<split.length; i++) {
            if(split[i].equals(".")) {

                if(size != 0) {
                    xNum.add(size);
                    size = 0;
                }

                xNum.add(0);

            } else {
                size++;
            }
        }

        if(size != 0) {
            xNum.add(size);
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<Integer> xNum;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int x : xNum) {
            if(x%2 != 0) {
                res = new StringBuilder("-1");
                break;
            }

            for(int i=0; i<x/4; i++) {
                res.append("AAAA");
            }

            if(x%4 != 0) {
                res.append("BB");
            }

            if(x == 0) {
                res.append(".");
            }
        }

        System.out.println(res);
    }

}
