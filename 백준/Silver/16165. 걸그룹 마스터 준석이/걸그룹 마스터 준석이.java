import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 걸그룹의 수
        int M = Integer.parseInt(st.nextToken()); // 문제의 수

        Map<String, Set<String>> teamMap = new HashMap<>(); // 팀별 멤버 해쉬맵
        Map<String, String> memTeamNameMap = new HashMap<>(); // 멤버별 소속팀 해쉬맵
        while(N-->0) {
            String teamName = br.readLine(); // 팀 이름
            int headCount = Integer.parseInt(br.readLine()); // 인원수

            Set<String> memberSet = new HashSet<>();
            while(headCount-->0) {
                String memberName = br.readLine();
                memberSet.add(memberName);
                memTeamNameMap.put(memberName, teamName);
            }

            teamMap.put(teamName, memberSet);
        }

        // 문제풀기
        while(M-->0) {
            String teamNameOrMemName = br.readLine();
            int pType = Integer.parseInt(br.readLine()); // 문제 유형 0: 팀이름, 1: 멤버이름

            switch(pType) {
                case 0 :
                    for(String memberName : teamMap.get(teamNameOrMemName).stream().sorted().collect(Collectors.toList())) {
                        res.append(memberName).append("\n");
                    }
                    break;
                case 1 : res.append(memTeamNameMap.get(teamNameOrMemName)).append("\n");
                    break;
            }
        }

        System.out.println(res.toString());
        br.close();
    }

}
