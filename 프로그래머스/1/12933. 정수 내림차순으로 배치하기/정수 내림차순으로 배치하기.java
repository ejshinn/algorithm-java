import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = String.valueOf(n).split("");
        
        Arrays.sort(arr);
        
        String newStr = "";
        for(int i = arr.length - 1; i >= 0; i--) {
            newStr += arr[i];
        }
        
        answer = Long.parseLong(newStr);
        
        return answer;
    }
}