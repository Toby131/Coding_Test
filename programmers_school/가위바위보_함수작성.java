class Solution {
    public int[] solution(int[][] gawibawibo) {
        int[] answer = new int[2];
        int yhSum = 0;
        int csSum = 0;
        
        for(int i = 0 ; i < gawibawibo[0].length; i++){
            if(gawibawibo[0][i] == 2 && gawibawibo[1][i] == 5) yhSum++;
            else if(gawibawibo[0][i] == 0 && gawibawibo[1][i] == 2) yhSum++;
            else if(gawibawibo[0][i] == 5 && gawibawibo[1][i] == 0) yhSum++;
            
            else if(gawibawibo[0][i] == 5 && gawibawibo[1][i] == 2) csSum++;
            else if(gawibawibo[0][i] == 2 && gawibawibo[1][i] == 0) csSum++;
            else if(gawibawibo[0][i] == 0 && gawibawibo[1][i] == 5) csSum++;
        }
        answer[0] = yhSum;
        answer[1] = csSum;
        return answer;
    }
}