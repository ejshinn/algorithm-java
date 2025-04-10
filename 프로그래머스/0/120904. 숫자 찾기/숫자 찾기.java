class Solution {
    public int solution(int num, int k) {
        String str_num = num + "";
        String str_k = k + "";
        
        if(str_num.contains(str_k)) {
            return str_num.indexOf(str_k) + 1;
        } else {
            return -1;
        }
    }
}