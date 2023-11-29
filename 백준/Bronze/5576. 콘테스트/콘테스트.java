import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> nList = new ArrayList<>();
        int n = 20;
        while(n-->0) {
            nList.add(Integer.parseInt(br.readLine()));
        }

        List<Integer> WList = new ArrayList<>();
        List<Integer> KList = new ArrayList<>();
        n = 10;
        while(n-->0) {
            WList.add(nList.get(n));
            KList.add(nList.get(n+10));
        }

        StringBuilder res = new StringBuilder();
        res.append(WList.stream()
                    .sorted(Comparator.reverseOrder())
                    .limit(3)
                    .mapToInt(i->i)
                    .sum())
            .append(" ")
            .append(KList.stream()
                    .sorted(Comparator.reverseOrder())
                    .limit(3)
                    .mapToInt(i->i)
                    .sum());

        System.out.println(res.toString());
        br.close();
    }

}
