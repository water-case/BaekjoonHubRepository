class Solution {
    public int solution(String number) {
        int cal = 0;
        
        String[] nArr = number.split("");
        for(String n : nArr) {
            cal += Integer.parseInt(n);
        }
        
        return cal % 9;
    }
}