import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);
        solve();

        System.out.println(res);
        br.close();
    }

    static double res;
    static Score grade;
    static String subGrade;

    private static void solve() {
        res += grade.getScore();

        switch(subGrade) {
            case "+":
                res += 0.3;
                break;
            case "-":
                res -= 0.3;
                break;
        }
    }

    private static void init(BufferedReader br) throws Exception {
        res = 0.0D;
        subGrade = "0";
        
        String[] str = br.readLine().split("");

        grade = Score.valueOf(str[0]);
        if(str.length != 1) {
            subGrade = str[1];
        }
    }

    enum Score {
        A(4.0D), B(3.0D), C(2.0D), D(1.0D), F(0.0D);

        private double score;

        Score(double score) {
            this.score = score;
        }

        public double getScore() {
            return this.score;
        }
    }

}
