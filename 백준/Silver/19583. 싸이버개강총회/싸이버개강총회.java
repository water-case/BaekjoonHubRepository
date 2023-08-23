import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] times = br.readLine().split(" "); // 개총시작, 개총끝, 개총스트리밍끝
        int[] SEQ = new int[3];
        for(int i=0; i<3; i++) {
            String[] time = times[i].split(":");
            SEQ[i] = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
        }

        Set<String> attendanceSet = new HashSet<>();

        // 시간에 따라 채팅 인원 집합에 넣고 빼며 계산
        String str = "";
        int res = 0;
        while((str = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(str, " ");
            String[] time = st.nextToken().split(":"); // 채팅 시간
            String name = st.nextToken(); // 채팅 친 사람
            int enterTime = Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);
            
            if(enterTime <= SEQ[0]) {
                attendanceSet.add(name);
            } else if(enterTime >= SEQ[1] && enterTime <= SEQ[2] && attendanceSet.contains(name)) {
                attendanceSet.remove(name);
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
