import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().replaceAll("[^MOBIS]", "");

        final String MOBIS = "MOBIS";
        boolean res = true;
        for(int i=0; i<MOBIS.length(); i++) {
            if(!str.contains(MOBIS.substring(i,i+1))) {
                res = false;
                break;
            }
        }

        System.out.println(res ? "YES" : "NO");
        br.close();
    }

}
