import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> groupA = new ArrayList<>();
        List<Integer> groupB = new ArrayList<>();

        for(int i=0; i<4; i++) {
            groupA.add(Integer.parseInt(br.readLine()));
        }
        for(int i=0; i<2; i++) {
            groupB.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(groupA, Collections.reverseOrder());
        Collections.sort(groupB, Collections.reverseOrder());

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += groupA.get(i);
        }
        sum += groupB.get(0);

        System.out.println(sum);
        br.close();
    }

}
