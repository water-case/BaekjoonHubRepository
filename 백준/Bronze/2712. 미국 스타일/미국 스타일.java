import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            double value = Double.parseDouble(st.nextToken());
            String unit =  st.nextToken();

            double rValue = 0.0D;
            String rUnit = "";

            switch (unit) {
                case "kg" :
                    rValue = value * 2.2046;
                    rUnit = "lb";
                    break;
                case "lb" :
                    rValue = value * 0.4536;
                    rUnit = "kg";
                    break;
                case "l" :
                    rValue = value * 0.2642;
                    rUnit = "g";
                    break;
                case "g" :
                    rValue = value * 3.7854;
                    rUnit = "l";
                    break;
            }

            res.append(String.format("%.4f", rValue)).append(" ").append(rUnit).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
