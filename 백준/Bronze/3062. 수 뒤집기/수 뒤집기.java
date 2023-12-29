import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            String N = br.readLine();
            String reverseN = new StringBuilder(N).reverse().toString();

            res.append(checkSum(N, reverseN) ? "YES" : "NO")
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static boolean checkSum(String n, String reverseN) {
        List<String> sumList = Arrays.stream(String.valueOf(Integer.parseInt(n) + Integer.parseInt(reverseN)).split(""))
                                    .collect(Collectors.toList());

        int endIdx = sumList.size()-1;
        for(int i=0; i<sumList.size()/2; i++) {
            if(!sumList.get(i).equals(sumList.get(endIdx--))) {
                return false;
            }
        }

        return true;
    }

}
