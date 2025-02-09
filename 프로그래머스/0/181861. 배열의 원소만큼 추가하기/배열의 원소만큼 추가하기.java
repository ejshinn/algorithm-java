class Solution {
    public int[] solution(int[] arr) {
        int len = 0;
        
        for(int i = 0; i < arr.length; i++) {
            len += arr[i];
        }
        
        int[] answer = new int[len];
        int k = 0;
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[k++] = arr[i];
            }
        }
        
        return answer;
    }
}