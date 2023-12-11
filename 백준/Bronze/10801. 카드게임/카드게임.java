import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int aWin = 0, bWin = 0;
        int[] aCard = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int[] bCard = Arrays.stream(br.readLine().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        for(int i=0; i<10; i++) {
            if(aCard[i] == bCard[i]) {
                continue;
            } else if(aCard[i] > bCard[i]) {
                aWin++;
            } else {
                bWin++;
            }
        }

        System.out.println(aWin == bWin ? "D" : (aWin > bWin ? "A" : "B") );
        br.close();
    }

}
