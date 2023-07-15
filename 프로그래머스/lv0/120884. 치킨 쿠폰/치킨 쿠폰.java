class Solution {
    public int solution(int chicken) {
        
        int res = 0, ticket = 0;
        while(chicken != 0) {
            res += chicken/10;
            ticket += chicken%10;
            
            int ticket2 = ticket/10;
            res += ticket/10;
            ticket %= 10;
            ticket += ticket2;
            
            chicken /= 10;
        }
        
        return res;
    }
}