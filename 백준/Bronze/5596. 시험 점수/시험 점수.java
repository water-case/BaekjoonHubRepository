import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] sArr1 = br.readLine().split(" ");
        String[] sArr2 = br.readLine().split(" ");

        int sum1 = 0, sum2 = 0;
        for(int i=0; i<4; i++) {
            sum1 += Integer.parseInt(sArr1[i]);
            sum2 += Integer.parseInt(sArr2[i]);
        }

        System.out.println(sum1 > sum2 ? sum1 : sum2);
        br.close();
    }

}
