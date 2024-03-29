import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char[][] mbtiMap = {
            {'E', 'I'},
            {'S', 'N'},
            {'T', 'F'},
            {'J', 'P'}
    };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        char[] mbti = br.readLine().toCharArray();
        for(int i=0; i<mbti.length; i++) {
            res.append(mbti[i]==mbtiMap[i][0] ? mbtiMap[i][1] : mbtiMap[i][0]);
        }

        System.out.println(res.toString());
        br.close();
    }

}
