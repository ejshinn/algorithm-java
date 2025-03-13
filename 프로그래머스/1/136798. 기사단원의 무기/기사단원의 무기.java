class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0, index = 0;
        int[] arr = new int[number];
        
        for(int i = 1; i <= number; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    arr[index]++;
                } else if (i % j == 0) {
                    arr[index] += 2;
                }
            }
            
            index++;
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > limit) {
                answer += power;
            } else {
                answer += arr[i];
            }
        }
        
        return answer;
    }
}