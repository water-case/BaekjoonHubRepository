import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalGrade = 0.0D; // 학점의 합
        double totalScore = 0.0D; // 등급의 합

        String input = "";
        label: while((input = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(input, " " );
            
            st.nextToken();
            double grade = Double.parseDouble(st.nextToken());
            double score = 0.0D;
            switch (st.nextToken()) {
                case "A+" : score = 4.5D; break;
                case "A0" : score = 4.0D; break;
                case "B+" : score = 3.5D; break;
                case "B0" : score = 3.0D; break;
                case "C+" : score = 2.5D; break;
                case "C0" : score = 2.0D; break;
                case "D+" : score = 1.5D; break;
                case "D0" : score = 1.0D; break;
                case "P" : continue label;
            }
            totalScore += score * grade;
            totalGrade += grade;
        }

        System.out.println(String.format("%.6f", totalScore / totalGrade));
        br.close();
    }

}
