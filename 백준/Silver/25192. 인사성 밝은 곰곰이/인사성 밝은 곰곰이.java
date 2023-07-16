import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int res = 0;
        Set<String> set = null;
        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String chat = br.readLine();
            if(chat.equals("ENTER")) {
                set = new HashSet<>();
                continue;
            }

            if(!set.contains(chat)) {
                set.add(chat);
                res++;
            }
        }

        System.out.println(res);
        br.close();
    }

}
