class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (0 < angle && angle <=180) {
            if(0 < angle && angle < 90) {
                answer = 1;
            } else if (angle == 90) {
                answer = 2;
            } else if (angle == 180) {
                answer = 4;
            } else {
                answer = 3;
            }
        }
        return answer;
    }
}