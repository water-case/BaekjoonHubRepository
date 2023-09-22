import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 행
        int M = Integer.parseInt(st.nextToken()); // 열
        
        HashMap<String, int[]> map = new HashMap<>();
        
        for(int i=0; i<N; i++) {
            String row = br.readLine();
            
            int cnt = 0;
            for(int j=0; j<M; j++) {
                if(row.charAt(j) == '0') {
                    cnt++;
                }
            }
            int[] cntArr = map.getOrDefault(row, new int[] {cnt, 0}); // int 배열 [0갯수, 패턴갯수]
            cntArr[1] += 1;
            map.put(row, cntArr);
        }

        int K = Integer.parseInt(br.readLine()); // 스위치를 누르는 횟수
        int res = 0;

        for(String key : map.keySet()) {
            int[] cntArr = map.get(key);
            if(cntArr[0] <= K && (cntArr[0]%2 == K%2)) {
                res = Math.max(res, cntArr[1]);
            }
        }
        
        System.out.println(res);
        br.close();
    }

}
