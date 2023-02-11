import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();;
    }

    static int res, N, d, k, c;
    static ArrayList<Integer> belt;

    private static void solve() {
        int[] dcnt=new int[d+1];
        int cnt = 0;

        for(int i=0; i<N+k-1; i++) {
            if(i>=k) {
                if(dcnt[belt.get(i-k)]==1) {
                    cnt--;
                }
                dcnt[belt.get(i-k)]--;
            }

            if(dcnt[belt.get(i)]==0) {
                cnt++;
            }
            dcnt[belt.get(i)]++;

            if(dcnt[c]==0) {
                res=Math.max(res, cnt+1);
            } else {
                res=Math.max(res, cnt);
            }
        }
    }

    private static void init(BufferedReader br) throws Exception {
        res = -1;

        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        N=Integer.parseInt(st.nextToken()); // 접시개수
        d=Integer.parseInt(st.nextToken()); // 초밥의 가지수
        k=Integer.parseInt(st.nextToken()); // 연속해서 먹는 접시의 수
        c=Integer.parseInt(st.nextToken()); // 쿠폰 번호

        belt = new ArrayList<>();
        for(int i=0; i<N; i++) {
            belt.add(Integer.parseInt(br.readLine()));
        }

        for(int i=0; i<k-1; i++) {
            belt.add(belt.get(i));
        }
    }

}
