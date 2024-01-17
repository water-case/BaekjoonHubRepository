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

        int N = Integer.parseInt(br.readLine());

        List<String> map = new ArrayList<>();
        for(int i=0; i<N; i++) {
            map.add(br.readLine());
        }

        int K = Integer.parseInt(br.readLine());
        switch (K) {
            case 2:
                for(int i=0; i<N; i++) {
                    map.set(i, new StringBuilder(map.get(i)).reverse().toString());
                }
                break;
            case 3:
                Collections.reverse(map);
                break;
        }

        StringBuilder res = new StringBuilder();
        for(String row : map) {
            res.append(row).append("\n");
        }
        System.out.println(res.toString());
        br.close();
    }

}
