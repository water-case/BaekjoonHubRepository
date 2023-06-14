class Solution {
    public int solution(String binomial) {
        
        String[] sArr = binomial.split(" ");
        int res = 0, a = Integer.parseInt(sArr[0]), b = Integer.parseInt(sArr[2]);
        
        switch(sArr[1]) {
            case "+": res = a+b; break;
            case "-": res = a-b; break;
            case "*": res = a*b; break;
        }
        
        return res;
    }
}