import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int cnt = 0;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt+1];
        answer[0] = arr[0];
        
        int j = 1;
        
        for(int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]) {
                answer[j] = arr[i];
                j++;
            }
        }

        return answer;
    }
}