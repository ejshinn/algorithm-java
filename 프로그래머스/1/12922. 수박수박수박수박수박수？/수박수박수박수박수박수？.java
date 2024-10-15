class Solution {
    public String solution(int n) {
        String answer = "";
        int flag = 0;
        
        for(int i = 0; i < n; i++) {
            if(flag == 0) {
                answer += "수";
                flag = 1;
            } else {
                answer += "박";
                flag = 0;
            }
        }
        
        return answer;
    }
}