import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        String str = "";
        label:while(!(str = br.readLine()).equals("end")) {

            boolean chk = false;
            for(String s : str.split("")) {
                if(s.matches("[aeiou]")) {
                    chk = true;
                    break;
                }
            }
            if(!chk) {
                 res.append("<").append(str).append("> is not acceptable.").append("\n");
                 continue;
            }

            chk = true;
            boolean jamo = String.valueOf(str.charAt(0)).matches("[aeiou]") ? true : false; // 모음 true, 자음 false
            int jamoCnt = 0;
            for(String s : str.split("")) {
                if(s.matches("[aeiou]") == jamo){
                    if(++jamoCnt >= 3) {
                        chk = false;
                        break;
                    }
                } else {
                    jamo = !jamo;
                    jamoCnt = 1;
                }

            }
            if(!chk) {
                res.append("<").append(str).append("> is not acceptable.").append("\n");
                continue;
            }

            chk = true;
            String beforeStr = "";
            for(String s : str.split("")) {
                if(s.equals(beforeStr) && !s.matches("[eo]")) {
                    chk = false;
                    break;
                }
                beforeStr = s;
            }
            if(!chk) {
                res.append("<").append(str).append("> is not acceptable.").append("\n");
                continue;
            }

            res.append("<").append(str).append("> is acceptable.").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
