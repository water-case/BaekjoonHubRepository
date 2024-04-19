import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        while(K-->0) {
            int G = Integer.parseInt(st.nextToken());
            int P = (G*100)/N;

            int D = 0;
            if(P<=4) {
                D = 1;
            } else if(P<=11) {
                D = 2;
            } else if(P<=23) {
                D = 3;
            } else if(P<=40) {
                D = 4;
            } else if(P<=60) {
                D = 5;
            } else if(P<=77) {
                D = 6;
            } else if(P<=89) {
                D = 7;
            } else if(P<=96) {
                D = 8;
            } else if(P<=100) {
                D = 9;
            }

            res.append(D).append(" ");
        }

        System.out.println(res.toString());
        br.close();
    }

}
