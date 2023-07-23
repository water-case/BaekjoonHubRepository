import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 수의 개수
        int Q = Integer.parseInt(st.nextToken()); // 턴의 개수

        arr = new long[N];
        tree = new long[4 * N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0 ;i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 구간합 세그먼트 트리
        makeSegTree(0, N-1, 1);

        StringBuilder res = new StringBuilder();
        while(Q-->0) {
            st = new StringTokenizer(br.readLine(), " ");

            // x ~ y 의 값을 구하기
            int x = Integer.parseInt(st.nextToken())-1;
            int y = Integer.parseInt(st.nextToken())-1;

            if(x > y) {
                int tmp = y;
                y = x;
                x = tmp;
            }
            res.append(treeSum(0, N-1, 1, x, y)).append("\n");

            // a번째 수를 b로 바꾸기
            int a = Integer.parseInt(st.nextToken())-1;
            long b = Integer.parseInt(st.nextToken());
            treeUpdate(0, N-1, 1, a, b - arr[a]);
            arr[a] = b;

        }

        System.out.println(res.toString());
        br.close();
    }

    static long[] arr, tree;

    private static long makeSegTree(int start, int end, int node) {
        if(start == end) {
            return tree[node] = arr[start];
        }

        int mid = (start+end) / 2;

        return tree[node] += makeSegTree(start, mid, 2*node) + makeSegTree(mid+1, end, 2*node + 1);
    }

    private static long treeSum(int start, int end, int node, int left, int right) {
        if(left>end || right<start) {
            return 0;
        }

        if(left<=start && right>=end) {
            return tree[node];
        }

        int mid = (start+end) / 2;

        return treeSum(start, mid, 2*node, left, right) + treeSum(mid+1, end, 2*node + 1, left, right);
    }

    private static void treeUpdate(int start, int end, int node, int idx, long diff) {
        if(idx<start || idx>end) {
            return;
        }

        tree[node] = tree[node] + diff;

        if(start != end) {
            int mid = (start+end) / 2;
            treeUpdate(start, mid, 2*node, idx, diff);
            treeUpdate(mid+1, end, 2*node + 1, idx, diff);
        }
    }

}
