import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        sb.append("a = " + a).append("\n").append("b = " + b);
        System.out.println(sb);
    }
}