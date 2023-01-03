import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] wheel = new char[N];
        Arrays.fill(wheel, '?');

        String res = "";
        int idx = 0;
        while(K-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            int changeWord = Integer.parseInt(st.nextToken());
            char alpha = st.nextToken().charAt(0);

            idx = (idx + (N - (changeWord%N) ) ) % N;
            if(wheel[idx] != '?' && wheel[idx] != alpha ) {
                res = "!";
                break;
            }
            wheel[idx] = alpha;
        }

        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<N; i++) {
            if(!set.contains(wheel[i])) {
                set.add(wheel[i]);
            } else if(wheel[i] != '?') {
                res = "!";
                break;
            }
        }

        if(!"!".equals(res)) {
            for(int i=0; i<N; i++){
                res += wheel[ (idx+i) % N];
            }
        }

        System.out.println(res);
        br.close();
    }

}
