class Solution {
    public int solution(int[] sequence) {
        int n = sequence.length;
        int[] dp = new int[n]; 
         
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (sequence[i] < sequence[j]) {
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
            }
        }
        
        int maxLen = 0;
        for (int len : dp) {
            maxLen = Math.max(maxLen, len);
        }
        
        return maxLen;
    }
}