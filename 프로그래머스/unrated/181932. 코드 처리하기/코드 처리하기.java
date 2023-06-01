class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        
        String[] codeArr = code.split("");
        boolean mode = false;
        
        for(int i=0; i<code.length(); i++) {
            
            if(codeArr[i].equals("1")) {
                mode = !mode;
                continue;
            }
            
            if(checkCode(mode, i)) {
                sb.append(codeArr[i]);
            }
            
        }
        
        sb.append(sb.length() == 0 ? "EMPTY" : "");
        
        return sb.toString();
    }
    
    private boolean checkCode(boolean mode, int idx) {
        if(mode) {
            if(idx%2!=0) {
                return true;
            }
        } else {
            if(idx%2==0) {
                return true;
            }
        }
        
        return false;
    }
}