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

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> nList = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(N-->0) {
                nList.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(nList);
            res.append(nList.get(0)).append(" ").append(nList.get(nList.size()-1)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
