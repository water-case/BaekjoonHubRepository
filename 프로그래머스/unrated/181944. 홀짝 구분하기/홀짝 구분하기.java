import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String res = " is odd";
        if(n%2==0) {
            res = " is even";
        }
        
        System.out.println(n + res);
    }
}