class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int pCount = 0;
        int yCount = 0;
        
        char[] sArray = s.toCharArray();
        
        for(int i = 0; i < sArray.length; i++) {
            if(sArray[i] == 'p' || sArray[i] == 'P') {
                pCount++;
            }
            else if(sArray[i] == 'y' || sArray[i] == 'Y') {
                yCount++;
            }
        }
        
        if(pCount == yCount) {
            answer = true;
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        

        return answer;
    }
}