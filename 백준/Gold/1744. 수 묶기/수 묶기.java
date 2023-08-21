import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> nList = new ArrayList<>();
        while(N-->0) {
            nList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(nList);

        int res = 0, start = 0, end = nList.size() - 1;

        // 둘다 음수 또는 0이면 곱
        while(start + 1 < nList.size()) {
            int a = nList.get(start);
            int b = nList.get(start + 1);
            if(a < 1 && b < 1) {
                res += a * b;
                start += 2;
            } else {
                break;
            }
        }

        // 둘다 양수면 합
        while(end - 1 >= 0) {
            int a = nList.get(end);
            int b = nList.get(end - 1);
            if(a > 1 && b > 1) {
                res += a * b;
                end -= 2;
            } else {
                break;
            }
        }

        // 이외의 경우는 그냥 더하기
        for(int i = start; i<=end; i++) {
            res += nList.get(i);
        }

        System.out.println(res);
        br.close();
    }

}
