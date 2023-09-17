import java.util.*;

public class Solution {
    public int[] solution(int n, int[] photo) {
        Queue<Integer> board = new LinkedList<>();

        for (int p : photo) {
            if (board.contains(p)) {
                continue;
            } 
            else if (board.size() < n) {
                
board.add(p)
;
            } 
            else {
                
board.poll()
;
                board.add(p);
            }
        }


        int[] answer = new int[board.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = 
board.poll()
;
        }

        Arrays.sort(answer);
        return answer;
    }
}
