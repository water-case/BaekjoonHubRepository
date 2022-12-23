import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> otherPick = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int dasomPick = Integer.parseInt(br.readLine());
        for(int i = 0; i < N-1; i++){
            otherPick.add(Integer.parseInt(br.readLine()));
        }

        int res = (N != 1) ? solve(dasomPick) : 0;
        System.out.println(res);
        br.close();
    }

    private static int solve(int dasomPick) {
        int preDasomPick = dasomPick;

        while(true) {
            Collections.sort(otherPick, (o1, o2) -> -Integer.compare(o1, o2));

            int num = otherPick.get(0);
            if(num < dasomPick) break;

            otherPick.set(0, num-1);
            dasomPick++;
        }

        return dasomPick - preDasomPick;
    }

}
