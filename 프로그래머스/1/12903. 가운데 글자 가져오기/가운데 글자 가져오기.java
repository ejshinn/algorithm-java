class Solution {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int mid = s.length() / 2;
        
        if(s.length() % 2 == 0) {
            answer += arr[mid - 1];
        }
        
        answer += arr[mid];
        
        return answer;
    }
}