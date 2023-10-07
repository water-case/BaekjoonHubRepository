import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder rx = new StringBuilder(st.nextToken());
        StringBuilder ry = new StringBuilder(st.nextToken());
        StringBuilder rev = new StringBuilder(String.valueOf(Integer.parseInt(rx.reverse().toString()) + Integer.parseInt(ry.reverse().toString()))).reverse();

        System.out.println(Integer.parseInt(rev.toString()));
        br.close();
    }

}
