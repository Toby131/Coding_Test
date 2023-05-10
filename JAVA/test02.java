public import java.util.*;
import java.util.Collections;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Integer[] tempB = new Integer[B.length];
        for(int k = 0; k < B.length ; k++){
            tempB[k] = B[k];
        }

        Arrays.sort(A);
        Arrays.sort(tempB, Collections.reverseOrder());
        
        for(int i = 0 ; i < A.length ; i++){
            answer += A[i] * tempB[i];
        }

        return answer;
    }
} test02 {
    
}
