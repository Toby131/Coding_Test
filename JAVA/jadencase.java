class Solution {
    public String solution(String s) {
        String answer = "";
        
        String temp = s.toLowerCase();
        
        String [] arr = temp.split(" ");
        
        for(int i = 0; i < arr.length-1 ; i++){
            answer = answer + arr[i].substring(0,1).toUpperCase()
                + arr[i].substring(1,arr[i].length()) + " ";
        }
        answer = answer + arr[arr.length-1].substring(0,1).toUpperCase() + arr[arr.length-1].substring(1,arr[arr.length-1].length());
        return answer;
    }
}