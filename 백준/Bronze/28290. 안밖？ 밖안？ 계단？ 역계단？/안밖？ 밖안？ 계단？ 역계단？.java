import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "";
        switch (br.readLine()) {
            case "fdsajkl;" :
            case "jkl;fdsa" : res = "in-out"; break;
            case "asdf;lkj" :
            case ";lkjasdf" : res = "out-in"; break;
            case "asdfjkl;" : res = "stairs"; break;
            case ";lkjfdsa" : res = "reverse"; break;
            default: res = "molu"; break;
        }

        System.out.println(res);
        br.close();
    }

}
