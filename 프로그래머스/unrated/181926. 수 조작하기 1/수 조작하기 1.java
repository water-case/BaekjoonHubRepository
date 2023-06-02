class Solution {
    public int solution(int n, String control) {
        String[] c = control.split("");
        for(int i=0; i<c.length; i++) {
            switch(c[i]) {
                case "w": n++; break;
                case "s": n--; break;
                case "d": n+=10; break;
                case "a": n-=10; break;
            }
        }
        
        return n;
    }
}