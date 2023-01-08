import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] students;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            init(br);
            int res = solve();
            sb.append(res).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }

    private static int solve() {
        int res = 0;

        // 홀수에 1개씩 넣어주기
        giveOdd();

        while(!candyCheck()) {
            candyMove();
            giveOdd();
            res++;
        }

        return res;
    }

    private static void giveOdd() {
        for(int i=0; i<N; i++){
            if(students[i]%2 != 0) {
                students[i]++;
            }
        }
    }

    private static void candyMove() {
        int[] tmp = new int[N];
        for(int i=0; i<N; i++) {
            tmp[i] += students[i]/2;
            tmp[(i+1)%N] += students[i]/2;
        }
        students = tmp;
    }

    private static boolean candyCheck() {
        boolean res = true;
        int standard = students[0];

        for(int i=1; i<N; i++) {
            if(standard != students[i]) {
                res = false;
                break;
            }
        }

        return res;
    }

    private static void init(BufferedReader br) throws Exception {
        N = Integer.parseInt(br.readLine());
        students = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }
    }


}
