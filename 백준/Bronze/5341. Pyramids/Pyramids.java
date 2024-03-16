import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            int h = Integer.parseInt(br.readLine());
            if(h==0) {
                break;
            }

            res.append(pyramidsCnt(h)).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static int pyramidsCnt(int h) {
        if(h==1) {
            return 1;
        }

        return h + pyramidsCnt(h-1);
    }

}
