import java.io.*;
import java.util.*;

public class Main {

    static int max, min;
    static int[] num=new int[4];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        int T=Integer.parseInt(br.readLine());
        while(T-->0) {
            int inum=Integer.parseInt(br.readLine());
            int res=0;
            if(inum==6174) {
                res=0;
            } else {
                for(int i=3; i>=0; i--) {
                    num[i]=inum%10;
                    inum/=10;
                }
                res=kaprekar();
            }
            
            sb.append(res).append("\n");
        }
        
        System.out.println(sb.toString());
        br.close();
    }

    private static int kaprekar() {
        int cnt=0;
        
        while(true) {
            cnt++;
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            Perm(0,new boolean[4],new int[4]);
            
            int cal=max-min;
            if(cal==6174) break;
            for(int i=3; i>=0; i--) {
                num[i]=cal%10;
                cal/=10;
            }
        }
        
        return cnt;
    }
    
    private static void Perm(int cnt, boolean[] v, int[] nums) {
        if(cnt==4) {
            int cal=0;
            for(int i=0; i<4; i++) cal=(cal*10)+nums[i];
            
            min=Math.min(min, cal);
            max=Math.max(max, cal);
            return;
        }
        
        for(int i=0; i<4; i++) {
            if(v[i]) continue;
            
            nums[cnt]=num[i];
            v[i]=true;
            Perm(cnt+1, v, nums);
            v[i]=false;
        }
    }
    
}
