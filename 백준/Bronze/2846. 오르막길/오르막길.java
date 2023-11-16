import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> nList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            nList.add(Integer.parseInt(st.nextToken()));
        }

        int min = nList.get(0), now = 0, res = 0;
        for(int n : nList) {
            if(now>=n) {
                res = Math.max(res, now - min);
                min = now = n;
                continue;
            }

            now = n;
        }
        res = Math.max(res, now - min);

        System.out.println(res);
        br.close();
    }

}
