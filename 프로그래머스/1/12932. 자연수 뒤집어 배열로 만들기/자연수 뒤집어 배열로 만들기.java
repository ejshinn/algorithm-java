class Solution {
    public int[] solution(long n) {
        String str = "" + n;
        int[] answer = new int[str.length()];
        int i = 0;
        
        while(n > 0) {
            answer[i] = (int)(n % 10);
            i++;
            n /= 10;
        }
        
        return answer;
    }
}