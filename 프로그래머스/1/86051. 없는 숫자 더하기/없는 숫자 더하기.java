class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr = new int[10];
        
        for(int i = 0; i < 10; i++) {
            arr[i] = i;
            answer += i;
        }
        
        for(int i = 0; i < numbers.length; i++) {
            for(Integer arrNum : arr) {
                if(arrNum.equals(numbers[i])) {
                    answer -= numbers[i];
                }
            }
        }
        
        return answer;
    }
}