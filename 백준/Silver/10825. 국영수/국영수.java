import java.io.*;
import java.util.*;

public class Main {

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        sList = new ArrayList<>();
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            sList.add(new Student(st.nextToken(), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        br.close();
    }

    public static void main(String[] args) throws IOException {
        init();
        solve();
    }

    static List<Student> sList;

    private static void solve() {
        StringBuilder res = new StringBuilder();

        Collections.sort(sList);
        sList.stream().forEach(stu -> res.append(stu.name).append("\n"));

        System.out.println(res.toString());
    }

    private static class Student implements Comparable<Student> {
        String name;
        int kor, eng, mat;

        public Student(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.mat = mat;
            this.eng = eng;
        }

        @Override
        public int compareTo(Student o) {
            if(this.kor != o.kor) {
                return -Integer.compare(this.kor, o.kor);
            }

            if(this.eng != o.eng) {
                return Integer.compare(this.eng, o.eng);
            }

            if(this.mat != o.mat) {
                return -Integer.compare(this.mat, o.mat);
            }

            return this.name.compareTo(o.name);
        }

    }

}
