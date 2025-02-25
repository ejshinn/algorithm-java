import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char[] str = my_string.toCharArray();
        
        for(int i = 0; i < index_list.length; i++) {
            answer += str[index_list[i]];
        }
        
        return answer;
    }
}