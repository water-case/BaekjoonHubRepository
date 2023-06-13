class Solution {
    public String solution(String myString, String pat) {
        String res = "";
        for(int i=myString.length()-pat.length(); i>=0; i--) {
            if(myString.substring(i, i+pat.length()).equals(pat)) {
                res = myString.substring(0, i+pat.length());
                break;
            }
        }
        return res;
    }
}