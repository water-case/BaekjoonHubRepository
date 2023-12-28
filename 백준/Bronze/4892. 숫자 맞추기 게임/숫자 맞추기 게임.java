import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String input = "";
        int idx = 1;

        while(true) {
            input = br.readLine();
            if(input.equals("0")) {
                break;
            }

            int n1 = 3 * Integer.parseInt(input);

            int n2 = n1%2==0 ? n1/2 : (n1+1)/2;

            int n3 = 3 * n2;

            int n4 = n3 / 9;


            res.append(idx++)
                .append(n1%2==0 ? ". even " : ". odd ")
                .append(n4)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
