import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        strList = new ArrayList<>();
        String input = "";
        while((input = br.readLine()) != null) {
            strList.add(input);
        }

    }

    static List<String> strList;

    private static void solve() {

        for(String s : strList) {
            int small = 0, big = 0, num = 0, blank = 0;

            char[] ca = s.toCharArray();
            for(char c : ca) {
                if(c>=65 && c<=90) {
                    big++;
                }
                else if(c>=97 && c<=122) {
                    small++;
                }
                else if(c>=48 && c<=57) {
                    num++;
                }
                else if(c==32) {
                    blank++;
                }
            }
            System.out.println(small + " " + big + " " + num + " " + blank);
        }
    }

}
