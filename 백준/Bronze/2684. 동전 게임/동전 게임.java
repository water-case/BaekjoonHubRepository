import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int P = Integer.parseInt(br.readLine());
        while(P-->0) {
            int[] iArr = new int[8];

            String str = br.readLine();
            for(int i=0; i<38; i++) {
                iArr[coinSeq.valueOf(str.substring(i, i+3)).ordinal()]++;
            }

            for(int n : iArr) {
                res.append(n).append(" ");
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private enum coinSeq {
        TTT, TTH, THT, THH, HTT, HTH, HHT, HHH
    }

}
