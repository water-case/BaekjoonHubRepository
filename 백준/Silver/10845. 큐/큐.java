import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        nList = new ArrayList<>();
        while(N-->0) {
            nList.add(br.readLine());
        }

        br.close();
    }

    static List<String> nList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        ArrayDeque<String> q = new ArrayDeque<>();
        for(String n : nList) {
            StringTokenizer st = new StringTokenizer(n, " ");

            switch(st.nextToken()) {
                case "push":
                    q.offer(st.nextToken());
                    break;
                case "pop":
                    res.append(q.isEmpty() ? -1 : q.pop()).append("\n");
                    break;
                case "size":
                    res.append(q.size()).append("\n");
                    break;
                case "empty":
                    res.append(q.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    res.append(q.isEmpty() ? -1 : q.peekFirst()).append("\n");
                    break;
                case "back":
                    res.append(q.isEmpty() ? -1 : q.peekLast()).append("\n");
                    break;
            }
        }

        System.out.println(res);
    }

}
