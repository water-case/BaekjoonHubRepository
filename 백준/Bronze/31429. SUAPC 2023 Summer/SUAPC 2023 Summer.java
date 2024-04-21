import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] solveNumArr = {12, 11, 11, 10, 9, 9, 9, 8, 7, 6, 6};
        int[] penaltyArr = {1600, 894, 1327, 1311, 1004, 1178, 1357, 837, 1055, 556, 773};

        int N = Integer.parseInt(br.readLine()) - 1;

        System.out.println(solveNumArr[N] + " " + penaltyArr[N]);
        br.close();
    }

}
