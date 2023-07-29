import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 사람수
        int M = Integer.parseInt(st.nextToken()); // 파티수
        
        // 주어지는 파티의 순서와 상관이 없어야하므로 분리집합을 구현하는 유니온파인드 사용
        parent = makeSet(N);

        // 진실을 아는 사람들은 0번 집합으로 세팅
        st = new StringTokenizer(br.readLine(), " ");
        int tcnt = Integer.parseInt(st.nextToken());
        while(tcnt-->0) {
            parent[Integer.parseInt(st.nextToken())] = 0;
        }

        // 파티를 돌면서 분리집합 만들기
        List<List<Integer>> partyList = new ArrayList<>();
        while(M-->0) {
            List<Integer> party = new ArrayList<>();
            
            // 파티 가져오기
            st = new StringTokenizer(br.readLine(), " ");
            int pcnt = Integer.parseInt(st.nextToken());
            while(pcnt-->0) {
                party.add(Integer.parseInt(st.nextToken()));
            }
        
            // 분리집합 만들기
            for(int i=1; i<party.size(); i++) {
                union(party.get(0), party.get(i));
            }

            partyList.add(party);
        }

        int res = 0;

        // 파티 분리집합 체크
        for(List<Integer> party : partyList) {
            boolean chk = true;
            for(int num : party) {
                if(find(num) == parent[0]) {
                    chk = false;
                    break;
                }
            }
            if(chk) {
                 res++;
            }
        }

        System.out.println(res);
        br.close();
    }

    static int[] parent;

    private static int[] makeSet(int size) {
        return IntStream.rangeClosed(0, size).toArray();
    }

    private static int find(int x) {
        if(x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    private static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if(x > y) {
            parent[x] = y;
        } else {
            parent[y] = x;
        }
    }

}
