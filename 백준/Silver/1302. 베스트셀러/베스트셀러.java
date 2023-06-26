import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        nameList = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            nameList.add(br.readLine());
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<String> nameList;

    private static void solve() {
        String res = "";

        Collections.sort(nameList);

        List<Book> bookList = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(String name : nameList) {
            if(set.contains(name)) {
                bookList.get(bookList.size()-1).sales++;
                continue;
            }

            set.add(name);
            bookList.add(new Book(name, 1));
        }

        Collections.sort(bookList);
        res = bookList.get(0).name;

        System.out.println(res);
    }

    private static class Book implements Comparable<Book> {

        private String name;
        private int sales;

        public Book(String name, int sales) {
            this.name = name;
            this.sales = sales;
        }

        public void selling() {
            sales++;
        }

        @Override
        public int compareTo(Book o) {
            if(sales == o.sales) {
                return name.compareTo(o.name);
            }

            return -Integer.compare(sales, o.sales);
        }
    }

}
