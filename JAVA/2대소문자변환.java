import java.util.Scanner;
  
public class Main {
  public String solution(String str){
    String answer = "";
  	for(int i = 0 ; i < str.length(); i ++)
    {
      char c = str.charAt(i);
      if(Character.isUpperCase(c))
        answer += Character.toLowerCase(c);
      else
        answer += Character.toUpperCase(c);
    }
    return answer;
  }
  
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in = new Scanner(System.in);
    String str = in.next();
	System.out.print(T.solution(str));
  }
}