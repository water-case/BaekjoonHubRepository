class Solution {
    public int[] solution(int[] num_list) {
        int size = num_list.length;
        
        int[] res = new int[size+1];
        for(int i=0; i<size; i++) {
            res[i] = num_list[i];
        }
        
        res[size] = res[size-2] < res[size-1] ? res[size-1] - res[size-2] : 2*res[size-1];
        
        return res;
    }
}