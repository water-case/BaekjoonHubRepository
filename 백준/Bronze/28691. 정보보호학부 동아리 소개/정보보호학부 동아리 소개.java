import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String res = "";
        switch (br.readLine()) {
            case "M": res = "MatKor"; break;
            case "W": res = "WiCys"; break;
            case "C": res = "CyKor"; break;
            case "A": res = "AlKor"; break;
            case "$": res = "$clear"; break;
        }

        System.out.println(res);
        br.close();
    }

}
