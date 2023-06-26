import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringBuilder res = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                res.append("*");
            }
            res.append("\n");
        }
        
        System.out.println(res.toString());
    }
}