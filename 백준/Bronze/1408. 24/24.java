import java.io.*;
import java.util.*;

public class Main {

    private static final int MIN = 60;
    private static final int HOUR = 60 * MIN;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int[] secArr = new int[2];
        for(int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ":");
            secArr[i] =
                    Integer.parseInt(st.nextToken()) * HOUR +
                    Integer.parseInt(st.nextToken()) * MIN +
                    Integer.parseInt(st.nextToken());
        }

        int calSec = secArr[1] - secArr[0];
        if(calSec<0) {
            calSec += 24 * HOUR;
        }
        
        res.append(String.format("%02d", calSec/HOUR)).append(":");
        calSec%=HOUR;
        res.append(String.format("%02d", calSec/MIN)).append(":");
        calSec%=MIN;
        res.append(String.format("%02d", calSec));

        System.out.println(res.toString());
        br.close();
    }

}
