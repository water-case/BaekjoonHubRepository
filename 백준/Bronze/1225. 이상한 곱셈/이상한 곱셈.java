import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        List<Integer> AList = Arrays.stream(st.nextToken().split(""))
                .map(a -> Integer.parseInt(a))
                .collect(Collectors.toList());
        List<Integer> BList = Arrays.stream(st.nextToken().split(""))
                .map(b -> Integer.parseInt(b))
                .collect(Collectors.toList());

        long res = 0;
        for(int a : AList){
            for(int b : BList) {
                res += a * b;
            }
        }

        System.out.println(res);
        br.close();
    }

}
