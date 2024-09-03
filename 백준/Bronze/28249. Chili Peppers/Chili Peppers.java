import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String name = br.readLine();

            int SHU = 0;
            switch (name) {
                case "Poblano"  : SHU = 1500;   break;
                case "Mirasol"  : SHU = 6000;   break;
                case "Serrano"  : SHU = 15500;  break;
                case "Cayenne"  : SHU = 40000;  break;
                case "Thai"     : SHU = 75000;  break;
                case "Habanero" : SHU = 125000; break;
            }

            res += SHU;
        }

        System.out.println(res);
        br.close();
    }

}
