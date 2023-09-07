import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numArr = Arrays.stream(br.readLine().split(""))
                            .mapToInt(Integer::parseInt)
                            .toArray();

        String res = "NO";
        for(int i=1; i<numArr.length; i++) {

            long cal1 = 1, cal2 = 1;

            for(int j=0; j<i; j++) {
                cal1 *= numArr[j];
            }

            for(int j=i; j<numArr.length; j++) {
                cal2 *= numArr[j];
            }

            if(cal1 == cal2) {
                res = "YES";
                break;
            }
        }

        System.out.println(res);
        br.close();
    }

}
