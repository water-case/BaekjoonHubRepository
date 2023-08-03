import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) - 1; // 맨앞에 하나 빼기 떄문에 1 빼줌
        List<Integer> nList = new ArrayList<>();

        int pre = Integer.parseInt(br.readLine());
        while(N-->0) {
            int now = Integer.parseInt(br.readLine());
            nList.add(now - pre);
            pre = now;
        }

        int gcd = nList.get(0);
        for(int n : nList) {
            gcd = gcd(gcd, n);
        }

        int res = 0;
        for(int i=0; i<nList.size(); i++) {
            res += (nList.get(i) / gcd) - 1;
        }

        System.out.println(res);
        br.close();
    }

    private static int gcd(int x, int y) {
        if(y == 0) {
            return x;
        }

        return gcd(y, x%y);
    }

}
