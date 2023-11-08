import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<String> serialList = new ArrayList<>();
        while(N-->0) {
            serialList.add(br.readLine());
        }

        Collections.sort(serialList, (o1, o2) -> {
            if(o1.length() != o2.length()) {
                return o1.length() > o2.length() ? 1 : -1;
            }

            int o1Sum = o1.chars().filter(c -> Character.isDigit(c)).map(c -> (int)c-48).sum();
            int o2Sum = o2.chars().filter(c -> Character.isDigit(c)).map(c -> (int)c-48).sum();

            if(o1Sum != o2Sum) {
                return o1Sum > o2Sum ? 1 : -1;
            }

            return o1.compareTo(o2);
        });

        StringBuilder res = new StringBuilder();
        for(String serial : serialList) {
            res.append(serial).append("\n");
        }
        System.out.println(res.toString());
        br.close();
    }

}
