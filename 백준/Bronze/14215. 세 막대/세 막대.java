import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] abc = Stream.of(a, b, c)
                .sorted()
                .mapToInt(i->i)
                .toArray();

        int sum = abc[0] + abc[1];
        if(abc[2] >= sum) {
            abc[2] = sum-1;
        }

        System.out.println(abc[0] + abc[1] + abc[2]);
        br.close();
    }

}
