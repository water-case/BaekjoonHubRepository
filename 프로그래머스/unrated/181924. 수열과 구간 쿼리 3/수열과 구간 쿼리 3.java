class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for(int idx=0; idx<queries.length; idx++) {
            int i = queries[idx][0], j = queries[idx][1];
            
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        
        return arr;
    }
}