import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            char[] messageArr = br.readLine().toCharArray();
            char[] cryptoquoteArr = br.readLine().toCharArray();

            for(int i=0; i<messageArr.length; i++) {
                res.append(messageArr[i]==' ' ? " " : cryptoquoteArr[messageArr[i]-65]);
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
