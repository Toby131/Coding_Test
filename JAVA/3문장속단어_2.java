import java.util.Scanner;
  
public class Main {
  public String solution(String str){
  	String answer = "";
    int m = Integer.MIN_VALUE, pos;
    while((pos = str.indexOf(' ')) != -1){
      String tmp = str.substring(0, pos);
      int len = tmp.length();
      if(len > m){ //같다고 하면 가장 앞쪽에 위차한 단어를 답으로 안함
      	m = len;
        answer = tmp;
      }
      str = str.substring(pos+1);
    }
    if(str.length() > m)
      answer = str;
    return answer;
  }
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.nextLine();
    System.out.print(T.solution(str));
  }
}