import java.util.List;

class Solution {
    public int solution(String[] password) {
        int valid_count = 0;

        for (String pw : password) {
            boolean[] char_used = new boolean[26];  

            for (char c : pw.toCharArray()) {
                int index = c - 'a';
                char_used[index] = true;
            }

            int unique_char_count = 0;
            for (boolean used : char_used) {
                if (used) {
                    unique_char_count++;
                }
            }

            if (unique_char_count >= 5) {
                valid_count++;
            }
        }

        return valid_count;
    }
}
