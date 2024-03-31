import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            String classNum = "";
            switch (br.readLine()) {
                case "Algorithm" : classNum = "204"; break;
                case "DataAnalysis" : classNum = "207"; break;
                case "ArtificialIntelligence" : classNum = "302"; break;
                case "CyberSecurity" : classNum = "B101"; break;
                case "Network" : classNum = "303"; break;
                case "Startup" : classNum = "501"; break;
                case "TestStrategy" : classNum = "105"; break;
            }
            res.append(classNum).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
