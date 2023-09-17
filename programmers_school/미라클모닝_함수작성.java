class Solution {
    public int solution(String[] time) {
        int answer = 0;
        
        for(int i = 0 ; i < time.length ; i ++){
            int hour = Integer.parseInt(time[i].substring(0, 2));
            int min = Integer.parseInt(time[i].substring(3, 5));
            
            if(time[i].substring(6, 8).equals("am")){
                if(hour >= 3 && hour < 6) answer ++;
                if(hour == 6){
                    if(min <= 30)
                        answer++;
                }
            }
        }
        
        return answer;
    }
}