import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        K = Integer.parseInt(br.readLine());
        cxArr = new ClassX[K];
        
        for(int i=0; i<K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int[] nArr = new int[N];

            for(int j=0; j<nArr.length; j++) {
                nArr[j] = Integer.parseInt(st.nextToken());
            }

            cxArr[i] = new ClassX(nArr);
        }
        
        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static int K;
    static ClassX[] cxArr;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<K; i++) {
            res.append("Class ").append(i+1).append("\n");
            res.append("Max ").append(cxArr[i].getMax()).append(", ");
            res.append("Min ").append(cxArr[i].getMin()).append(", ");
            res.append("Largest gap ").append(cxArr[i].getMaxGap()).append("\n");
        }

        System.out.println(res.toString());
    }

    private static class ClassX {
        int N;
        int[] nArr;

        public ClassX(int[] nArr) {
            this.N = nArr.length;
            this.nArr = nArr;

            Arrays.sort(nArr);
        }

        public int getMax() {
            return nArr[N -1];
        }

        public int getMin() {
            return nArr[0];
        }

        public int getMaxGap() {
            return IntStream.range(0, nArr.length-1)
                    .mapToObj(i -> nArr[i+1] - nArr[i])
                    .max(Integer::compare).get();
        }
    }

}
