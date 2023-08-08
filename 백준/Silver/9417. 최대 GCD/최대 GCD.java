import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            List<Integer> nList = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                nList.add(Integer.parseInt(st.nextToken()));
            }

            int max = 0;
            for(int i=0; i<nList.size(); i++) {
                for(int j=i+1; j<nList.size(); j++) {
                    max = Math.max(max, gcd(nList.get(i), nList.get(j)));
                }
            }

            res.append(max).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int gcd(int x, int y) {

        if(y==0) {
            return x;
        }

        return gcd(y, x%y);

    }

}
