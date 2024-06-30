import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] cntArr = new int[4];

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();

            cntArr[FRUIT.valueOf(name).ordinal()] += Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.stream(cntArr).filter(i -> i==5).count()>0 ? "YES" : "NO");
        br.close();
    }

    private enum FRUIT {
        STRAWBERRY, BANANA, LIME, PLUM
    }

}
