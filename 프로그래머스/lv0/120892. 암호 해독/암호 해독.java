class Solution {
    public String solution(String cipher, int code) {
        String res = "";
        
        String[] sArr = cipher.split("");
        for(int i=0; i<sArr.length; i++) {
            if((i+1)%code == 0) {
                res += sArr[i];
            }
        }
        
        return res;
    }
}