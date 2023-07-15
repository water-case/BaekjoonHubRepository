import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 저장된 사이트 주소의 수
        int M = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려는 사이트 주소의 수

        // 사이트 주소와 비밀번호를 삽입과 검색시 시간복잡도가 O(1)인 해쉬맵으로 저장
        Map<String, String> map = new HashMap<>();
        while(N-->0) {
            st = new StringTokenizer(br.readLine(), " ");
            map.put(st.nextToken(), st.nextToken());
        }

        // 해쉬맵을 통해 비밀번호 찾기
        StringBuilder res = new StringBuilder();
        while(M-->0) {
            res.append(map.get(br.readLine())).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
