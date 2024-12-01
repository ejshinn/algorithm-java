class Solution {
    public int solution(int a, int b) {
        
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);
            
        if(Integer.parseInt(num1) >= Integer.parseInt(num2)) {
            return Integer.parseInt(num1);
        }
        else {
            return Integer.parseInt(num2);
        }
    }
}