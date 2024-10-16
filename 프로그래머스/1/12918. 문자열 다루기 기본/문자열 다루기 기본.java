class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if (s.length() == 4 || s.length() == 6) {
            try {
                Integer numbers = Integer.parseInt(s);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        
        return false;
    }
}