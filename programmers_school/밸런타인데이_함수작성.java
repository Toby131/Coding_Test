class Solution {
    public int solution(String[] dates) {
        int answer = 0;
        
        for(int i = 0 ; i < dates.length; i++){
            int like = 1 ;
            for(int j = 0 ; j < dates[i].length(); j++){
                if (dates[i].charAt(j) == '/') 
                    continue;
                if(dates[i].charAt(j) != '1' &&
                   dates[i].charAt(j) != '2' &&
                   dates[i].charAt(j) != '4' && 
                   dates[i].charAt(j) != '8')
                    like = 0;
            }
            if(like == 1) answer ++;
        }
        return answer;
    }
}