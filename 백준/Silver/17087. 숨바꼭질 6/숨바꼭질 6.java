import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 동생은 N명
        int S = Integer.parseInt(st.nextToken()); // 수빈이는 S위치

        st = new StringTokenizer(br.readLine(), " ");
        List<Integer> distList = new ArrayList<>();
        while(N-->0) {
            distList.add(Math.abs(S - Integer.parseInt(st.nextToken())));
        }

        int res = distList.get(0);
        for(int dist : distList) {
            res = gcd(res, dist);
        }

        System.out.println(res);
        br.close();
    }

    private static int gcd(int x, int y) {
        if(y==0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
