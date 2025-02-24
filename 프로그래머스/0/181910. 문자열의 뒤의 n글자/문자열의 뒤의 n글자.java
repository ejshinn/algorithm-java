import java.util.*;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int len = my_string.length();
        char[] str = my_string.toCharArray();
        
        for(int i = len - n; i < len; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}