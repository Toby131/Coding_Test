class Solution {
    public String solution(String s) {
        String answer = "";
        
        String temp = s.toLowerCase();
        
        String [] arr = temp.split(" ");
        
        for(int i = 0; i < arr.length ; i++){
            answer = answer + arr[i].substring(0,1).toUpperCase()
                + arr[i].substring(1,arr[i].length()) + " ";
        }
        answer = answer.substring(0, answer.length()-1);
        return answer;
    }
}