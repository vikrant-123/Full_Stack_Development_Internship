package first_Unique_Char;

import java.util.*;

public class First_Unique_Character {

  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter the Text: ");
    String inputLine = s.nextLine(); 
    char first = firstChar(inputLine);
    System.out.println("The First Non-Repeating Character in String is: "+first);
    s.close();
  }
  public static char firstChar(String input) {
	  char[] arr =input.toCharArray();
	  int[] count = new int[256];
	  for(char a:arr) {
		  count[a]++;
	  }
	  
	  for(char a:arr) {
		  if (count[a] == 1) {
              return a;
          }
	  }
	  return 0;
  }
}


