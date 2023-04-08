class Solution {
    public String solution(String s) {
        String answer = "";
        
        String [] stringArr = s.split(" ");
        int min, max;
        min = max =  Integer.parseInt(stringArr[0]);
        for(int i = 1 ; i < stringArr.length; i++){
            if(min >  Integer.parseInt(stringArr[i])){
                min = Integer.parseInt(stringArr[i]);
            }
            if(max < Integer.parseInt(stringArr[i])){
                max = Integer.parseInt(stringArr[i]);
            }
        }
        answer = min + " " + max;
        return answer;
    }
}
