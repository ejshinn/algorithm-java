import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for(int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0], parts[i][parts[i].length - 1] + 1);
        }
        
        return answer;
    }
}