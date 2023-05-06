class Main {
    public int solution(String pos) {
        
        int answer = 0;
			  int posFirst = pos.substring(0).charAt(0)-64;
			  int posSecond = Integer.parseInt(pos.substring(1,pos.length()));
			  
			if(posFirst-2 >= 0 && posSecond -1 >= 0) answer++;
			if(posFirst-2 >= 0 && posSecond +1 >= 0 && posSecond +1 < 8) answer++;
			if(posFirst-1 >= 0 && posSecond -2 >= 0) answer++;
			if(posFirst-1 >= 0 && posSecond +2 >= 0 && posSecond +2 < 8) answer++;
			if(posFirst+1 >= 0 && posFirst+1 < 8 && posSecond -2 >= 0) answer++;
			if(posFirst+1 >= 0 && posFirst+1 < 8 && posSecond +2 >= 0 && posSecond +2 < 8) answer++;
			if(posFirst+2 >= 0 && posFirst+2 < 8 && posSecond -1 >= 0) answer++;
			if(posFirst+2 >= 0 && posFirst+2 < 8 && posSecond +1 >= 0 && posSecond +1 < 8) answer++;
			 
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