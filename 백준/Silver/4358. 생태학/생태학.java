import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 최대 10_000 개의 종과 1_000_000 그루의 나무가 입력으로 주어지므로 시간복잡도가 O(1)인 해쉬맵을 사용함
        Map<String, Integer> map = new HashMap<>();

        // 입력 개수가 주어지지 않으므로 널체크를 통해 입력받음
        String input = "";
        while((input = br.readLine()) != null) {

            int cnt = 0;
            if(map.containsKey(input)) {
                cnt = map.get(input);
            }

            map.put(input, cnt + 1);
        }

        // 해쉬맵의 나무 이름들을 사전순으로 정렬한 리스트로 변환함
        List<String> treeNameList = map.keySet()
                                        .stream()
                                        .sorted()
                                        .collect(Collectors.toList());

        // 총 나무 그루수
        int totalTreeCount = map.values()
                                .stream()
                                .mapToInt(i -> i)
                                .sum();

        StringBuilder res = new StringBuilder();
        for(String treeName : treeNameList) {
            res.append(treeName)
                .append(" ")
                .append(String.format("%.4f", (double)map.get(treeName) / totalTreeCount * 100))
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
