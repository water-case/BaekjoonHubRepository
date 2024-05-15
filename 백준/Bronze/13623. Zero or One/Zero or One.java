import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int zeroCnt = 0, oneCnt = 0;
        String[] sArr = br.readLine().split(" ");
        for(int i=0; i<sArr.length; i++) {
            if(sArr[i].equals("0")) {
                zeroCnt++;
            } else {
                oneCnt++;
            }
        }

        int res = 0;
        if(zeroCnt==3 || oneCnt==3) {
            res = 0;
        } else {
            for(int i=0; i<sArr.length; i++) {
                if(sArr[i].equals(zeroCnt==1 ? "0" : "1")) {
                    res = i+1;
                    break;
                }
            }
        }

        System.out.println(res==0 ? "*" : res==1 ? "A" : res==2 ? "B" : "C");
        br.close();
    }

}
