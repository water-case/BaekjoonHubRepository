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

        List<Integer> nList = new ArrayList<>();
        while(N-->0) {
            nList.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder res = new StringBuilder();

        res.append(cntTrophy(nList, 1)).append("\n")
            .append(cntTrophy(nList, -1));

        System.out.println(res.toString());
        br.close();
    }

    private static int cntTrophy(List<Integer> nList, int direct) {
        int res = 1;

        if(direct==-1) {
            Collections.reverse(nList);
        }

        int now = nList.get(0);
        for(int n : nList) {
            if(now < n) {
                res++;
                now = n;
            }
        }

        return res;
    }

}
