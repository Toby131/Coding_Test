// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
    public int solution(int[] arr, int K) {
        
      int answer = 0;
			int arrLength = arr.length;
			
			for(int i = 0 ; i < arrLength ; i++){
				for(int j = i+1 ; j < arrLength ; j++){
					for(int k = j+1 ; k < arrLength ; k++){
						if((arr[i]+arr[j]+arr[k]) % K == 0){
							answer++;
						}
					}
				}
			}
			
      return answer;
    }

        // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
        public static void main(String[] args) {
            Main sol = new Main();
            int[] arr = {1, 2, 3, 4, 5};
            int K = 3;
            int ret = sol.solution(arr, K);
    
    
            // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
            System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
        }
    }