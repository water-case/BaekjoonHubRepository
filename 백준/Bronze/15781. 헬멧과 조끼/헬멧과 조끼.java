import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 헬멧의개수
        int M = Integer.parseInt(st.nextToken()); // 조끼의개수

        List<Integer> helmetList = new ArrayList<>();
        List<Integer> vestList = new ArrayList<>();
        st = new StringTokenizer(br.readLine(), " ");
        while(N-->0) {
            helmetList.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine(), " ");
        while(M-->0) {
            vestList.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(helmetList, Collections.reverseOrder());
        Collections.sort(vestList, Collections.reverseOrder());

        System.out.println(helmetList.get(0) + vestList.get(0));
        br.close();
    }

}
