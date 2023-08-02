import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        Node[] graph = new Node[n+1];
        for(int i=0; i<=n; i++) {
            graph[i] = new Node();
        }

        while(m-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].addFriend(b);
            graph[b].addFriend(a);
        }

        int res = 0;
        boolean[] visit = new boolean[n+1];

        // 상근이 친구 초대
        List<Integer> friendList = graph[1].getFriendList();
        for(int friendNo : friendList) {
            if(!visit[friendNo]) {
                visit[friendNo] = true;
                res++;
            }

            // 상근이 친구의 친구 초대
            for(int friendsFriendNo : graph[friendNo].getFriendList()) {
                if(!visit[friendsFriendNo]) {
                    visit[friendsFriendNo] = true;
                    res++;
                }
            }
        }

        if(visit[1]) {
            res--;
        }
        System.out.println(res);
        br.close();
    }

    private static class Node {
        private List<Integer> friendList;

        public Node() {
            friendList = new ArrayList<>();
        }

        public void addFriend(int num) {
            friendList.add(num);
        }

        public List<Integer> getFriendList() {
            return friendList;
        }

    }

}
