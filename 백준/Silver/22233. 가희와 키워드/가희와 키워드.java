import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 메모장에 적은 키워드 개수
        int M = Integer.parseInt(st.nextToken()); // 블로그에 쓴 글의 개수

        Set<String> memo = new HashSet<>();
        while(N-->0) {
            memo.add(br.readLine());
        }

        while(M-->0) {
            st = new StringTokenizer(br.readLine(), ",");
            while(st.hasMoreTokens()) {
                memo.remove(st.nextToken());
            }

            res.append(memo.size()).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
