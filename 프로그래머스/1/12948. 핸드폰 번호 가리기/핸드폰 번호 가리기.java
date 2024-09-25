class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] strArr = phone_number.toCharArray();
        int len = strArr.length;
        
        for(int i = 0; i < len; i++) {
            if(i < len - 4) {
                answer += '*';
            } else {
                answer += strArr[i];
            }
            
        }
        
        return answer;
    }
}