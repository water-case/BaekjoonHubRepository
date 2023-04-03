import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        angles = new int[3];
        for(int i=0; i<3; i++) {
            angles[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(angles);

        br.close();
    }

    static int[] angles;

    private static void solve() {
        String res = "Error";

        int sum = Arrays.stream(angles).sum();
        if(sum==180) {
            res = angles[0]==60 && angles[1]==60
                    ? "Equilateral" : (angles[0]==angles[1] || angles[1]==angles[2] ? "Isosceles" : "Scalene");
        }

        System.out.println(res);
    }

}
