class Solution {
    public int solution(String myString, String pat) {
        String replaceStr = myString.replace("A", "X").replace("B", "A").replace("X", "B");
        
        if(replaceStr.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}