import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()) {
            if(Character.isUpperCase(c)) {
                sb.append((char)(c + 32));
            } else {
                sb.append((char)(c - 32));
            }
        }
        System.out.println(sb);
    }
}