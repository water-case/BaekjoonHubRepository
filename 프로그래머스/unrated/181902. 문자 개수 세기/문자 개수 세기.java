class Solution {
    public int[] solution(String my_string) {
        int[] res = new int[52];
        
        char[] str = my_string.toCharArray();
        for(int i=0; i<str.length; i++) {
            if(str[i] > 90) {
                res[26 + str[i] - 'a']++;
            } else {
                res[str[i] - 'A']++;
            }
        }
        
        return res;
    }
}