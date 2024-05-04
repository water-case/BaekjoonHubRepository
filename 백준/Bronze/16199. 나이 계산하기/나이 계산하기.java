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
        int birthY = Integer.parseInt(st.nextToken());
        int birthM = Integer.parseInt(st.nextToken());
        int birthD = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        int nowY = Integer.parseInt(st.nextToken());
        int nowM = Integer.parseInt(st.nextToken());
        int nowD = Integer.parseInt(st.nextToken());

        if(birthM < nowM || (birthM == nowM && birthD <= nowD)) {
            res.append(nowY - birthY);
        } else {
            res.append(nowY - birthY - 1);
        }
        res.append("\n");

        res.append(nowY - birthY + 1).append("\n")
            .append(nowY - birthY);

        System.out.println(res.toString());
        br.close();
    }

}
