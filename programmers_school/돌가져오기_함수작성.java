class Solution {
    public int solution(int n, int k, int[] rocks) {
        int answer = 0;
        int count = 0;
        for(int i = 0 ; i < rocks.length; i++){
            k -= rocks[i];
            if(k <= 0) return count +1;
            else count = (count+1) % n;
        }
        return -1;
    }
}