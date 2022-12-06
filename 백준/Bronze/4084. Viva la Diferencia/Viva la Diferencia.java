import java.io.*;
import java.util.*;

public class Main {

    static int[] nums;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        
        while(true) {
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            nums=new int[4];
            int cnt=0;
            for(int i=0; i<4; i++) {
                nums[i]=Integer.parseInt(st.nextToken());
                if(nums[i]==0) cnt++;
            }
            if(cnt==4) break;
            
            int res=0;
            while(!check()) {
                calc();
                res++;
            }
            sb.append(res).append("\n");
        }
        System.out.println(sb.toString());
    }

    private static void calc() {
        int[] tmp=new int[4];
        for(int i=0; i<4; i++) {
            tmp[i]=Math.abs(nums[i]-nums[(i+1)%4]);
        }
        nums=tmp;
    }

    private static boolean check() {
        for(int i=0; i<3; i++) {
            if(nums[i]!=nums[i+1]) return false;
        }
        return true;
    }

}
