class Solution {
    public int solution(int[][] dice) {
        int answer = 0;
        for(int i = 0 ; i < dice.length ;i++){
            if(dice[i][0] == dice[i][1])
            {
                answer += dice[i][0] * 1000;
            }
            else
            {
                if(dice[i][0] < dice[i][1])
                {
                    answer += (dice[i][1] * 500) + (dice[i][0] * 100);
                }
                else
                {
                    answer += (dice[i][0] * 500) + (dice[i][1] * 100);
                }
            }
        }
        return answer;
    }
}