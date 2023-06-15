import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        pList = new LinkedList<>();

        n = Integer.parseInt(br.readLine());
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            String name = st.nextToken();
            int day = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int year = Integer.parseInt(st.nextToken());

            pList.add(new People(name, day, month, year));
        }

        br.close();
    }

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    static int n;
    static List<People> pList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        Collections.sort(pList);

        String old = pList.get(0).toString();
        String young = pList.get(pList.size()-1).toString();

        res.append(young).append("\n").append(old);

        System.out.println(res);
    }

    static private class People implements Comparable<People> {
        String name;
        int day, month, year;

        public People(String name, int day, int month, int year) {
            this.name = name;
            this.day = day;
            this.month = month;
            this.year = year;
        }

        @Override
        public int compareTo(People o) {
            int res = Integer.compare(year, o.year);
            if(res == 0) {
                res = Integer.compare(month, o.month);
            }
            if (res == 0) {
                res = Integer.compare(day, o.day);
            }
            return res;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}
