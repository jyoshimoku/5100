package asignment3;
import java.util.Scanner;
// import java.util.*;
class Reverse{
public static String reverse(String s) {
  String result = new String();
  int i = 0;
  int n = s.length();

  while(i < n){
      while(i < n && s.charAt(i) == ' ') i++;
      if(i >= n) break;
      int j = i + 1;
      while(j < n && s.charAt(j) != ' ') j++;
      String sub = s.substring(i, j);
      if(result.length() == 0) result = sub;
      else result = sub + " " + result;
      i = j+1;
  }
  return result;
}
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("please enter your sentence.");
	String str = scanner.nextLine();
String a = reverse(str);
System.out.print(a);
}


}
