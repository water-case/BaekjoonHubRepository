import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0; // 정답 카운팅

        int N = Integer.parseInt(br.readLine()); // 단어의 개수
        Set<String> wordSet = new HashSet<>(); // 단어를 집합으로 관리하여 중복을 없앰

        while(N-->0) {

            // 문자배열로 만들고 정렬하여 같은 알파벳으로 구성되어 있다면 같은 문자열이 되도록 구현함
            char[] input = br.readLine().toCharArray();
            Arrays.sort(input);

            String word = "";
            for(char c : input) {
                word += c;
            }

            if(wordSet.contains(word)) {
                continue;
            }

            res++;
            wordSet.add(word);
        }

        System.out.println(res);
        br.close();
    }

}
