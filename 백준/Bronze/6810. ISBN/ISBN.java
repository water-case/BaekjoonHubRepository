import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String isbn = "9780921418";
        for(int i=0; i<3; i++) {
            isbn += br.readLine();
        }

        int[] nArr = new int[] {1, 3};
        int sum = 0;
        for(int i=0; i<isbn.length(); i++) {
            sum += (isbn.charAt(i)-48) * nArr[i%2];
        }

        System.out.println("The 1-3-sum is " + sum);
        br.close();
    }

}
