class Solution {
    public int solution(int[][] arr) {
        int res = 1;
        
        label : for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    res = 0;
                    break label;
                }
            }
        }
        
        return res;
    }
}