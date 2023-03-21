import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        init();
        solve();
    }

    private static void init() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        pairList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            pairList.add(new Pair(i, Integer.parseInt(st.nextToken())));
        }

        rmNum = Integer.parseInt(br.readLine());

        br.close();
    }

    static int rmNum;
    static List<Pair> pairList;
    static Set<Integer> set;

    private static void solve() {
        int res = 0;

        removeNode();
        res = countLeaf();

        System.out.println(res);
    }

    private static int countLeaf() {
        int cnt = 0;

        set = new HashSet<>();
        int idx = searchRoot();
        if(idx == -1) {
            return cnt;
        }

        int rootIdx = pairList.get(idx).idx;
        set.add(rootIdx);
        pairList.remove(idx);
        leafDfs(rootIdx);

        cnt = set.size();
        return cnt;
    }

    private static void leafDfs(int idx) {
        boolean rmChk = false;
        List<Integer> nextList = new ArrayList<>();
        for(int i=0; i<pairList.size(); i++) {
            Pair now = pairList.get(i);
            set.add(now.idx);
            if(now.parent == idx) {
                rmChk = true;
                pairList.remove(i);
                i--;
                nextList.add(now.idx);
            }
        }

        for(Integer i : nextList) {
            leafDfs(i);
        }

        if(rmChk) {
            set.remove(idx);
        }
    }

    private static int searchRoot() {
        int idx = -1;

        for(int i=0; i<pairList.size(); i++) {
            if(pairList.get(i).parent == -1) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    private static void removeNode() {
        pairList.remove(rmNum);
        rmDfs(rmNum);
    }

    private static void rmDfs(int rmNum) {
        List<Integer> rmList = new ArrayList<>();
        for(int i=0; i<pairList.size(); i++) {
            Pair now = pairList.get(i);
            int n = now.parent;
            if(rmNum == n) {
                pairList.remove(i);
                i--;
                rmList.add(now.idx);
            }
        }
        for(Integer i : rmList) {
            rmDfs(i);
        }
    }

    static class Pair {
        int idx, parent;

        public Pair(int idx, int parent) {
            this.idx = idx;
            this.parent = parent;
        }
    }

}
