import java.io.*;
import java.util.*;

public class Main {

    static PriorityQueue<Integer> otherPick = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1, o2));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dasomPick = Integer.parseInt(br.readLine());
        for(int i = 0; i < N-1; i++){
            otherPick.offer(Integer.parseInt(br.readLine()));
        }

        int res = (N != 1) ? solve(dasomPick) : 0;
        System.out.println(res);
        br.close();
    }

    private static int solve(int dasomPick) {
        int preDasomPick = dasomPick;

        while(true) {
            int num = otherPick.poll();
            if(num < dasomPick) break;

            otherPick.offer(num-1);
            dasomPick++;
        }

        return dasomPick - preDasomPick;
    }

}
