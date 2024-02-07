import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] gameData = new int[N][3];
        for(int i=0; i<N; i++) {
            gameData[i] = Arrays.stream(br.readLine().split(" "))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        }

        int[] resData = new int[N];

        for(int i=0; i<3; i++) {
            List<Integer> saveList = new ArrayList<>();
            Set<Integer> dupSet = new HashSet<>();
            for(int j=0; j<N; j++) {
                if(saveList.contains(gameData[j][i])) {
                    dupSet.add(saveList.indexOf(gameData[j][i]));
                    dupSet.add(j);
                }
                saveList.add(gameData[j][i]);
            }

            for(Integer idx : dupSet) {
                saveList.set(idx, 0);
            }

            for(int j=0; j<N; j++) {
                resData[j] += saveList.get(j);
            }
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<N; i++) {
            res.append(resData[i])
                .append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
