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
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        List<Integer> calList = new ArrayList<>();
        calList.add(A+B);
        calList.add(A-B);
        Collections.sort(calList, Collections.reverseOrder());

        calList.stream().forEach(i -> res.append(i).append("\n"));

        System.out.println(res.toString());
        br.close();
    }

}
