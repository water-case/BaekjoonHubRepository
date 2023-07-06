class Solution {
    public int[] solution(int[] array) {
        int res1 = -1, res2 = -1;
        
        for(int i=0; i<array.length; i++) {
            if(array[i] > res1) {
                res1 = array[i];
                res2 = i;
            }
        }
        
        return new int[] {res1, res2};
    }
}