class Solution {
    public int solution(String myString, String pat) {
        int res = 0;
        
        for(int i=0; i<=myString.length()-pat.length(); i++) {
            if(myString.substring(i, i+pat.length()).equals(pat)) {
                res++;
            }
        }
        
        return res;
    }
}