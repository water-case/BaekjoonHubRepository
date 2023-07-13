class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String res = "fail";
        for(int i=0; i<db.length; i++) {
            
            if(db[i][0].equals(id_pw[0])) {
                if(db[i][1].equals(id_pw[1])) {
                    res = "login";
                } else {
                    res = "wrong pw";
                }
            }
        }
        
        return res;
    }
}