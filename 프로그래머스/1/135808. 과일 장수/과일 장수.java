import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int index = score.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        Arrays.sort(score);
        
        for(int j = 0 ; j < score.length / m ; j++){
            for(int n = 0 ; n < m ; n++){
                list.add(score[index--]);
            }
            
            answer += m * Collections.min(list);
            list.clear();
        }
        
        return answer;
    }
}