class Solution {
    
    static int[] dice;
    
    public int solution(int a, int b, int c, int d) {
        dice = new int[7];
        dice[a]++;
        dice[b]++;
        dice[c]++;
        dice[d]++;
        
        int max = 0;
        for(int i=1; i<dice.length; i++) {
            max = Math.max(max, dice[i]);
        }
        
        int cal = 0;
        switch(max) {
            case 4:
                cal = pick(4, 1) * 1111;
                break;
            case 3:
                cal = (int) Math.pow(pick(3, 1) * 10 + pick(1, 1), 2);
                break;
            case 2:
                if(pick(2,2) != 0) {
                    int p = pick(2, 1), q = pick(2, 2);
                    cal = (p + q) * Math.abs(p - q);
                } else {
                    int p = pick(2, 1), q = pick(1, 1), r = pick(1, 2);
                    cal = q * r;
                }
                break;
            case 1:
                int min = 7;
                for(int i=1; i<=4; i++) {
                    min = Math.min(min, pick(1, i));
                }
                cal = min;
                break;
        }
        
        return cal;
    }
    
    private int pick(int num, int order) {
        int cnt = 0;
        int idx = 0;
        
        for(int i=0; i<dice.length; i++) {
            if(dice[i] == num) {
                cnt++;
                if(cnt == order) {
                    idx = i;
                    break;
                }
            }
        }
        
        return idx;
    }
}