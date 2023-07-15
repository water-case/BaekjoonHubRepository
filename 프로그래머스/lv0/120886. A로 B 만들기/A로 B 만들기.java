class Solution {
    public int solution(String before, String after) {
        
        int[] cnt = new int[26];
        
        char[] ba = before.toCharArray();
        char[] aa = after.toCharArray();
        for(int i=0; i<before.length(); i++) {
            cnt[ba[i]-'a']++;
            cnt[aa[i]-'a']--;
        }
        
        int res = 1;
        for(int i=0; i<26; i++) {
            if(cnt[i]!=0) {
                res = 0;
                break;
            }
        }
        
        return res;
    }
}