// 다음과 같이 import를 사용할 수 있습니다.
import java.util.*;

class Main {
		public void pos(HashSet<String> ds, int x, int y){
			String temp = x+""+y;
			if(!ds.contains(temp))
				ds.add(temp);
		}
    public int solution(String[] bishops) {
      int answer = 0;
			HashSet<String> ds = new HashSet<String>();
					
			for(int i = 0 ; i < bishops.length; i++){
				int x = bishops[i].charAt(0) - 'A';
				int y = bishops[i].charAt(1) - '0' -1;
				
				String temp = Integer.toString(x) + Integer.toString(y);
				ds.add(temp);
				
				for(int j = 0 ; j < 8; j++){
					if(x-j >= 0 && y+j < 8)
						pos(ds, x-j, y+j);
					if(x+j < 8 && y+j < 8)
						pos(ds, x+j, y+j);
					if(x+j < 8 && y-j >= 0)
						pos(ds, x+j, y-j);
					if(x-j >= 0 && y-j >= 0)
						pos(ds, x-j, y-j);
				}
			}

			answer = 64 - ds.size();
      return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String[] bishops1 = {new String("D5")};
        int ret1 = sol.solution(bishops1);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[] bishops2 = {new String("D5"), new String("E8"), new String("G2")};
        int ret2 = sol.solution(bishops2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
}