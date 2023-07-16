class Solution {
    public int solution(String A, String B) {
        for(int i=0; i<B.length(); i++) {
            if(A.equals(B)) {
                return i;
            } else {
                A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
                System.out.println(A);
            }
        }
        
        return -1;
    }
}