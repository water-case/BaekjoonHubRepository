import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0; // 정답 카운트
        Set<String> wordSet = new HashSet<>(); // 중복없이 단어를 저장할 집합

        int N = Integer.parseInt(br.readLine()); // 주어질 단어의 갯수
        while(N-->0) {
            String str = br.readLine();

            if(wordSet.contains(str)) { // 단어가 이미 포함되어 있다면 다음 단어로
                continue;
            }

            res++;
            str += str; // 사이클을 간단히 처리하기 위해 뒤에 문자열을 붙이고 인덱스로 모든 경우의 단어들을 집합에 추가

            for(int i=0; i<str.length()/2; i++) {
                wordSet.add(str.substring(i, i + str.length()/2));
            }
        }

        System.out.println(res);
        br.close();
    }

}
