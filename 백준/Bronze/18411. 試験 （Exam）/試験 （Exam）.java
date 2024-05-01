import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        ArrayList<Integer> nList = new ArrayList<>();
        for(int i=0; i<3; i++) {
            nList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(nList, Collections.reverseOrder());

        int sum = nList.get(0) + nList.get(1);
        System.out.println(sum);
        br.close();
    }

}
