import java.util.Arrays;

class Solution {
    public int[] solution(int[] sequence, String sorting) {
        int n = sequence.length;

        if (sorting.equals("Insertion Sort")) {
            for (int i = 1; i < n; i++) {
                int key = sequence[i];
                int j = i - 1;
                while (j >= 0 && sequence[j] > key) {
                    sequence[j + 1] = 
sequence[j]
;
                    j--;
                }
                sequence[j + 1] = key;
            }
        } else if (sorting.equals("Selection Sort")) {
            for (int i = 0; i < n; i++) {
                int minIdx = i;
                for (int j = i + 1; j < n; j++) {
                    if (sequence[j] < sequence[minIdx]) {
                        minIdx = j;
                    }
                }
                int temp = sequence[i];
                sequence[i] = 
sequence[minIdx]
;
                
sequence[minIdx]
 = temp;
            }
        } else if (sorting.equals("Bubble Sort")) {
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (sequence[j] > sequence[j + 1]) {
                        int temp = 
sequence[j]
;
                        
sequence[j]
 = sequence[j + 1];
                        sequence[j + 1] = temp;
                    }
                }
            }
        }

        return sequence;
    }
}