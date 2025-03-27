import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        String[] array = my_string.split("");
    
        Arrays.sort(array);
        
        return String.join("", array);
    }
}