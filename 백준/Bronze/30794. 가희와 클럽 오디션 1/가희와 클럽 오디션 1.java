import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int lv = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        int res = str.equals("bad") ? lv*200 :
                        str.equals("cool") ? lv*400 :
                                str.equals("great") ? lv*600 :
                                        str.equals("perfect") ? lv*1000 : 0;

        System.out.println(res);
        br.close();
    }

}
