class Solution {
    public int solution(long num) {
        int answer = -1;
        
        if(num == 1) {
            answer = 0;
        } else {
            for(int i = 0; i < 500; i++) {
                if(num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }
                
                if(num == 1) {
                    answer = i + 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}