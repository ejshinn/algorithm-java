import java.util.*;

class Solution {
    public List solution(String my_string) {
        List<String> answer = new ArrayList<>();
        String[] list = my_string.split(" ");
        
        for(int i = 0; i < list.length; i++){
            if(!list[i].equals("")) {
                answer.add(list[i]);
            }
        }
        
        return answer;
    }
}