import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        permArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            permArr[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder res = new StringBuilder();
        if(beforePermutation()) {
            for(int num : permArr) {
                res.append(num).append(" ");
            }
        } else {
            res.append(-1);
        }

        System.out.println(res.toString());
        br.close();
    }

    static int[] permArr;

    private static boolean beforePermutation() {
        int i = permArr.length-1;
        while(i > 0 && permArr[i-1] < permArr[i]) {
            i--;
        }

        if(i==0) {
            return false;
        }

        int j = permArr.length-1;
        while(permArr[i-1] < permArr[j]) {
            j--;
        }
        swap(i-1, j);

        j = permArr.length-1;
        while(i<j) {
            swap(i, j);
            i++;
            j--;
        }

        return true;
    }

    private static void swap(int i, int j) {
        int tmp = permArr[i];
        permArr[i] = permArr[j];
        permArr[j] = tmp;
    }

}
