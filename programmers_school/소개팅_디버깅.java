class Solution {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } 
        else {
            return n * factorial(n - 1);
        }
    }

    public int solution(int male, int female) {
        return factorial(male) / (factorial(male - female) * factorial(female));
    }
}
