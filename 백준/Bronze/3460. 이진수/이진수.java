import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int n = Integer.parseInt(br.readLine());

            String[] binaryStr = new StringBuilder(Integer.toBinaryString(n)).reverse().toString().split("");
            for(int i=0; i<binaryStr.length; i++) {
                if("1".equals(binaryStr[i])) {
                    res.append(i).append(" ");
                }
            }
            res.append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
