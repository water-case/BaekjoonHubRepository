class Solution {
    
    static final int MAX = 1_000_000;
    
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++) {
            
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            int min = MAX;
            
            for(int j=s; j<=e; j++) {
                
                if(arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            
            answer[i] = (min==MAX) ? -1 : min;
        }
        
        return answer;
    }
}