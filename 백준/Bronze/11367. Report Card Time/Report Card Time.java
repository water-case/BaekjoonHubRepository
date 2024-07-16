import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            String grade = getGrade(Integer.parseInt(st.nextToken()));

            res.append(name)
                .append(" ")
                .append(grade)
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static String getGrade(int score) {
             if(score >= 97) return "A+";
        else if(score >= 90) return "A";
        else if(score >= 87) return "B+";
        else if(score >= 80) return "B";
        else if(score >= 77) return "C+";
        else if(score >= 70) return "C";
        else if(score >= 67) return "D+";
        else if(score >= 60) return "D";
        else                 return "F";
    }

}
