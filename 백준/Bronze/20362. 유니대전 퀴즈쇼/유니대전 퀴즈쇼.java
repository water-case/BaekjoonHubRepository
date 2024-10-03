import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        String S = st.nextToken();

        int res = 0;
        Deque<String> stack = new ArrayDeque<>();
        while(N-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            String nickName = st.nextToken();
            String msg = st.nextToken();

            if(S.equals(nickName)) {
                while(!stack.isEmpty()) {
                    if(msg.equals(stack.pop())) {
                        res++;
                    }
                }
            } else {
                stack.offer(msg);
            }
        }

        System.out.println(res);
        br.close();
    }

}
