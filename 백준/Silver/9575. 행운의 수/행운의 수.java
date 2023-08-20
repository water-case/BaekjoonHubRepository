import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while(T-->0) {
            int[][] ABC = new int[3][];

            for(int i=0; i<3; i++) {
                br.readLine(); // 중복을 제거할것이므로 크기는 필요없어 흘려보냄
                ABC[i] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt)
                        .distinct()
                        .toArray();
            }

            Set<Integer> luckySet = new HashSet<>();

            for(int a : ABC[0]) {
                for(int b : ABC[1]) {
                    for(int c : ABC[2]) {
                        int sum = a + b + c;
                        
                        while(sum > 0) {
                            int num = sum % 10;
                            if(num!=5 && num!=8) {
                                break;
                            }
                            sum /= 10;
                        }

                        if(sum==0) {
                            luckySet.add(a + b + c);
                        }
                    }
                }
            }

            res.append(luckySet.size()).append("\n");
        }

        System.out.println(res.toString());
        br.close();
    }

}
