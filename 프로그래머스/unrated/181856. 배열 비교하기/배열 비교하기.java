import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if(arr1.length == arr2.length) {
            
            int sum1 = sum(arr1);
            int sum2 = sum(arr2);
            
            if(sum1 == sum2) {
                return 0;
            }
            
            return sum1 > sum2 ? 1 : -1;
            
        } else if(arr1.length > arr2.length) {
            
            return 1;
        }
        
        return -1;
    }
    
    public int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}