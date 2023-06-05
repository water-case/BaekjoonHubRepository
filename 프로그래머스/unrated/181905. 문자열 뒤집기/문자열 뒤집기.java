class Solution {
    public String solution(String my_string, int s, int e) {
        String str = my_string;
        
        return str.substring(0, s) + new StringBuilder(str.substring(s, e+1)).reverse() + str.substring(e+1, str.length());
    }
}