class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j < photo[i].length; j++) {
                for(int k = 0; k < yearning.length; k++) {
                    if(name[k].equals(photo[i][j])) {
                        answer[i] += yearning[k];
                        continue;
                    }
                }
            }
        }
        
        return answer;
    }
}