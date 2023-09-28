import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        duplCheckArr = duplCheck(5000);

        String str = "";
        while((str = br.readLine()) != null) {
            int[] na = Arrays.stream(str.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int cnt = 0;
            for(int i=na[0]; i<=na[1]; i++) {
                if(!duplCheckArr[i]) {
                    cnt++;
                }
            }
            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    static boolean[] duplCheckArr;

    private static boolean[] duplCheck(int size) {
        boolean[] res = new boolean[size+1];

        label: for(int num=1; num<=size; num++) {
            String[] nStr = String.valueOf(num).split("");
            for(int i=0; i<nStr.length; i++) {
                for(int j=i+1; j<nStr.length; j++) {
                    if(i==j) {
                        continue;
                    }

                    if(nStr[i].equals(nStr[j])) {
                        res[num] = true;
                        continue label;
                    }
                }
            }
        }

        return res;
    }

}
