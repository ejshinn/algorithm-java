class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c >= 'a' && c <= 'z') {
                if(c + n > 'z') {
                    answer += (char)(c - 26 + n);
                } else {
                    answer += (char)(c + n);
                }
            } else if(c >= 'A' && c <= 'Z') {
                if(c + n > 'Z') {
                    answer += (char)(c - 26 + n);
                } else {
                    answer += (char)(c + n);
                }
            } else {
                answer += c;
            }
        }
        
        return answer;
    }
}