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
    static char[] nameArr;
    static int N;
    static List<String> fileNameList;

    private static void solve() {
        nameArr = fileNameList.get(0).toCharArray();

        for(String s : fileNameList) {
            char[] tmp = s.toCharArray();
            for(int i=0; i<nameArr.length; i++) {
                if(nameArr[i] != tmp[i]) {
                    nameArr[i] = '?';
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : nameArr) {
            sb.append(c);
        }
        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        N = Integer.parseInt(br.readLine());
        fileNameList = new ArrayList<>();

        int idx = N;
        while(idx-->0) {
            fileNameList.add(br.readLine());
        }
    }

}
