import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        List<Integer> nList = new ArrayList<>();
        while(N-->0) {
            nList.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> qList = new ArrayList<>();
        while(Q-->0) {
            qList.add(Integer.parseInt(br.readLine()));
        }

        int totalTime = nList.stream()
                            .mapToInt(i->i)
                            .sum();

        int[] timeTable = new int[totalTime];
        int time = 0, idx = 1;
        for(Integer n : nList) {
            for(int i=0; i<n; i++) {
                timeTable[time++] = idx;
            }
            idx++;
        }

        for(Integer q : qList) {
            res.append(timeTable[q]).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
