import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        nums = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        br.close();
    }

    static int N;
    static int[] nums;

    private static void solve() {
        Fair res = null;

        int front = 0, back = N-1;
        res = new Fair(nums[front], nums[back]);

        while(front < back){
            Fair now = new Fair(nums[front], nums[back]);

            if(now.getValue() > 0) {
                back--;
            } else {
                front++;
            }

            if(res.getAbsValue() - now.getAbsValue() >= 0) {
                res = now;
            }
        }

        System.out.println(res);
    }

    private static class Fair {
        private int front, back;

        public Fair(int front, int back) {
            this.front = front;
            this.back = back;
        }

        public int getValue() {
            return front + back;
        }

        public int getAbsValue() {
            return Math.abs(front + back);
        }

        @Override
        public String toString() {
            return front + " " + back;
        }
    }

}
