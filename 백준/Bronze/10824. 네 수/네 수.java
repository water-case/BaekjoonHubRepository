import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        numList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<4; i++){
            numList.add(st.nextToken());
        }
    }

    static List<String> numList;

    private static void solve() {
        long ab = Long.parseLong(numList.get(0) + numList.get(1));
        long cd = Long.parseLong(numList.get(2) + numList.get(3));

        System.out.println(ab + cd);
    }

}
