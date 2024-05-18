import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder("Gnomes:\n");

        int N = Integer.parseInt(br.readLine());
        while(N-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            ArrayList<Integer> nList = new ArrayList<>();
            for(int i=0; i<3; i++) {
                nList.add(Integer.parseInt(st.nextToken()));
            }

            boolean isOrder = isSorted(nList);

            if(!isOrder) {
                Collections.reverse(nList);
                isOrder = isSorted(nList);
            }

            res.append(isOrder ? "Ordered" : "Unordered").append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

    private static boolean isSorted(List<Integer> nList) {
        int num = 0;
        for(Integer i : nList) {
            if(num < i){
                num = i;
            } else {
                return false;
            }
        }

        return true;
    }

}
