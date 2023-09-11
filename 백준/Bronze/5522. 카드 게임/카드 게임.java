import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int idx = 5, cal = 0;
        while(idx-->0) {
            cal += Integer.parseInt(br.readLine());
        }

        System.out.println(cal);
        br.close();
    }

}
