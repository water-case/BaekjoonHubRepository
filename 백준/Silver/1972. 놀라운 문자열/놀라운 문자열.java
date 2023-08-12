import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        while(true) {
            String word = br.readLine();
            if(word.equals("*")) {
                break;
            }

            boolean chk = true;
            label:for(int D=1; D<=word.length()-1; D++) {
                Set<String> DSet = new HashSet<>();
                for(int i=0; i<word.length()-D; i++) {
                    String DWord = String.valueOf(word.charAt(i)) + String.valueOf(word.charAt(i+D));
                    if(DSet.contains(DWord)) {
                        chk = false;
                        break label;
                    }
                    DSet.add(DWord);
                }
            }

            res.append(word).append(" is").append(chk ? "" : " NOT").append(" surprising.").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
