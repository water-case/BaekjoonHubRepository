import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int getN = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        
        System.out.println(set.size());
        
        return set.size() >= getN ? getN : set.size();
    }
}