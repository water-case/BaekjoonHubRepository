import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 학생수
        int C = Integer.parseInt(st.nextToken()); // 끝나는 시간

        int[] cycles = new int[N];
        for(int i=0; i<N; i++) {
            cycles[i] = Integer.parseInt(br.readLine());
        }

        int res = -1;
        do {
            for(int cycle : cycles) {
                if(C%cycle == 0) {
                    res++;
                    break;
                }
            }
        } while(C-->0);

        System.out.println(res);
        br.close();
    }

}
