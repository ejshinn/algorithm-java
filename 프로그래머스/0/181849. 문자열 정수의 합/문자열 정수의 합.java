class Solution {
    public int solution(String num_str) {
        int answer = 0;
        String[] list = num_str.split("");
        
        for(int i = 0; i < num_str.length(); i++) {
            answer += Integer.parseInt(list[i]);
        }
        
        return answer;
    }
}