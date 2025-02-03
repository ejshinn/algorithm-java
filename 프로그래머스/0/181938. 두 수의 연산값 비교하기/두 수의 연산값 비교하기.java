class Solution {
    public int solution(int a, int b) {
        String numStr = Integer.toString(a) + Integer.toString(b);
        int numInt = Integer.parseInt(numStr);
        
        if(numInt > 2 * a * b) {
            return numInt;
        } else {
            return 2 * a * b;
        }
    }
}