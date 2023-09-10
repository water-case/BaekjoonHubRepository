import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        pointList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pointList.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        int dist = 0;
        for(int i=0; i<N-1; i++) {
            dist += manhattan(i, i+1);
        }

        int res = dist;
        for(int i=1; i<N-1; i++) {
            int skipDist = dist + manhattan(i-1, i+1) - (manhattan(i-1, i) + manhattan(i, i+1));
            res = Math.min(res, skipDist);
        }

        System.out.println(res);
        br.close();
    }

    static List<int[]> pointList;

    private static int manhattan(int idx1, int idx2) {
        int[] p1 = pointList.get(idx1);
        int[] p2 = pointList.get(idx2);
        return Math.abs(p1[0]-p2[0]) + Math.abs(p1[1]-p2[1]);
    }

}
