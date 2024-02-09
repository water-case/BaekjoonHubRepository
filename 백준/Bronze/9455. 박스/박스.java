import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int[][] grid = new int[m][];
            for(int i=0; i<m; i++) {
                grid[i] = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
            }

            int sum = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(grid[j][i] == 1) {
                        for(int k=j+1; k<m; k++) {
                            if(grid[k][i] == 0) {
                                sum++;
                            }
                        }
                    }
                }
            }

            res.append(sum).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
