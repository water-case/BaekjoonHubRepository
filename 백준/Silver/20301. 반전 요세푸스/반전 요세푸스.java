import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ArrayDeque<Integer> dq = new ArrayDeque<>();
        for(int i=1; i<=N; i++){
            dq.offer(i);
        }

        boolean direct = true;
        int cnt = 0;
        StringBuilder sb = new StringBuilder();
        while(!dq.isEmpty()) {
            if(direct) {
                for(int i=1; i<K; i++) {
                    dq.offerLast(dq.pollFirst());
                }
                sb.append(dq.pollFirst()).append("\n");
            } else {
                for(int i=1; i<K; i++) {
                    dq.offerFirst(dq.pollLast());
                }
                sb.append(dq.pollLast()).append("\n");
            }
            cnt++;
            if(cnt%M==0) {
                direct = direct ? false : true;
            }
        }

        System.out.println(sb.toString());
        br.close();
    }

}
