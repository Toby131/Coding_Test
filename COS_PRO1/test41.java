class Main {
    public int solution(String pos) {
        
      int answer = 0;
      int[][] arr = new int[8][8];
			
      int[] dx = {2, 2, 1 ,1, -1, -1, -2, -2};
      int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
			
      int posA = pos.charAt(0) - 'A';
      int posB = pos.charAt(1) - '0' -1;
			
      for(int i = 0 ; i < 8 ; i++){
            int x = dx[i] + posA;
            int y = dy[i] + posB;
            if( x>= 0 && y >= 0 && x < 8 && y < 8){
                  answer++;
            }
      }
	    
      return answer;
    }
	
        // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        Main sol = new Main();
        String pos = "A7";
        int ret = sol.solution(pos);
    	
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
}
