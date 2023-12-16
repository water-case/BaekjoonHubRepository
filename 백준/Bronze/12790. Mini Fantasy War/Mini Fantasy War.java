import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int[] calHash = {1, 5, 2, 2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int[] ability = new int[4];
            for(int i=0; i<8; i++) {
                ability[i%4] += Integer.parseInt(st.nextToken());
            }

            int power = 0;
            for(int i=0; i<4; i++) {
                
                // HP, MP는 1보다 작은 경우 1로 간주
                if((i==0 || i==1) && ability[i]<1) {
                    ability[i] = 1;
                }
                // 공격력은 0보다 작은 경우 0으로 간주
                if(i==2 && ability[i]<0) {
                    ability[i] = 0;
                }
                
                power += ability[i] * calHash[i];
            }

            res.append(power).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
