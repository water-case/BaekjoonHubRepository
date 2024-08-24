import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int C = Integer.parseInt(br.readLine());
        while(C-->0) {
            int n = Integer.parseInt(br.readLine());

            Set<Integer> nSet = new HashSet<>();

            for(int i=1; i<=Math.sqrt(n); i++) {
                if(n%i==0) {
                    nSet.add(i);
                }
            }

            int[] sArr = nSet.stream()
                                .mapToInt(i->i)
                                .toArray();

            for(int s : sArr) {
                nSet.add(n/s);
            }

            res.append(n).append(" ").append(nSet.size()).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
