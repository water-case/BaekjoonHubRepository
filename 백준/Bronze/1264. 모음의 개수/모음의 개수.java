import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            String str = br.readLine();
            if("#".equals(str)) {
                break;
            }

            int cnt = 0;
            for(String s : str.split("")) {
               if(s.toLowerCase().matches("[aeiou]")) {
                   cnt++;
               }
            }
            res.append(cnt).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
