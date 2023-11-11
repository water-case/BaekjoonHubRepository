import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] resArr = new int[5];

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(x==0 || y==0) {
                resArr[0]++;
            } else if(x>0 && y>0) {
                resArr[1]++;
            } else if(x<0 && y>0) {
                resArr[2]++;
            } else if(x<0 && y<0) {
                resArr[3]++;
            } else if(x>0 && y<0) {
                resArr[4]++;
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=1 ;i<5; i++) {
            res.append("Q").append(i).append(": ").append(resArr[i]).append("\n");
        }
        res.append("AXIS").append(": ").append(resArr[0]).append("\n");
        System.out.println(res.toString());
        br.close();
    }

}
