import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        init(br);

        solve(br);

        System.out.println(res);
        br.close();
    }

    static int N, time, totalPush;
    static String res;
    static Student[] students = new Student[101];

    private static void solve(BufferedReader br) throws Exception {
        PriorityQueue<Student> pq=new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (totalPush-->0) {
            int nowPush=Integer.parseInt(st.nextToken());
            Student nowStudent = students[nowPush];

            if(!pq.contains(nowStudent)) {
                nowStudent.push(time);
                if(pq.size() < N) {
                    pq.offer(nowStudent);
                } else {
                    Student rmStudent = pq.poll();
                    rmStudent.remove();

                    pq.offer(nowStudent);
                }
            } else {
                pq.remove(nowStudent);
                nowStudent.push();
                pq.offer(nowStudent);
            }

            time++;
        }

        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> resList = new ArrayList<>();
        while(!pq.isEmpty()) {
            resList.add(pq.poll().id);
        }

        Collections.sort(resList);
        for(Integer i : resList) {
            sb.append(i).append(" ");
        }

        res = sb.toString();
    }

    private static void init(BufferedReader br) throws Exception {
        for(int i = 1; i <= 100; i++) {
            students[i] = new Student(i);
        }

        N = Integer.parseInt(br.readLine());
        totalPush = Integer.parseInt(br.readLine());
        time = 0;
    }

    static class Student implements Comparable<Student> {
        int id, push, time;

        public Student(int id) {
            this.id = id;
            push = 0;
            time = 0;
        }

        public void push() {
            push++;
        }
        public void push(int time) {
            push++;
            this.time = time;
        }

        public void remove() {
            push = 0;
            time = 0;
        }

        @Override
        public int compareTo(Student o) {
            if(this.push == o.push) {
                return Integer.compare(this.time, o.time);
            }
            return Integer.compare(this.push, o.push);
        }
    }

}
