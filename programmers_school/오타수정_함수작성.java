class Solution {
    public String[] solution(String[][] typo) {
        String[] answer = new String[typo.length];
        for(int i = 0 ; i < typo.length; i++){
            String str = typo[i][0];
            int idx = Integer.parseInt(typo[i][1]);
            String ans = str.substring(0, idx) + str.substring(idx+1);
            answer[i] = ans;
        }
        return answer;
    }
}