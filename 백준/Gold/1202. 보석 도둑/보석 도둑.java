import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        jewelList = new ArrayList<>();
        while(N-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            int weight = Integer.parseInt(st.nextToken());
            int price = Integer.parseInt(st.nextToken());

            jewelList.add(new Jewel(weight, price));
        }

        bagList = new ArrayList<>();
        while(K-->0) {
            bagList.add(Integer.parseInt(br.readLine()));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<Jewel> jewelList;
    static List<Integer> bagList;

    private static void solve() {
        long res = 0;

        Collections.sort(jewelList, (o1, o2) -> Integer.compare(o1.weight, o2.weight));
        Collections.sort(bagList);

        Queue<Jewel> pq = new PriorityQueue<>((o1, o2) -> -Integer.compare(o1.price, o2.price));
        int idx = 0;
        for(int bag : bagList) {

            while(idx<jewelList.size()) {
                Jewel jewel = jewelList.get(idx);
                if(jewel.weight > bag) {
                    break;
                }

                idx++;
                pq.offer(jewel);
            }

            if(!pq.isEmpty()) {
                res += pq.poll().price;
            }

        }

        System.out.println(res);
    }

    static private class Jewel {

        int weight, price;

        public Jewel(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }

}
