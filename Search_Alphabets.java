package search_alphabets;

import java.util.*;

public class Search_Alphabets {

  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter the Text: ");
    String inputLine = s.nextLine(); 
    boolean containsAlphabet = checkAlphabet(inputLine);

    System.out.println(containsAlphabet ? "true" : "false");
    s.close();
  }
  public static boolean checkAlphabet(String input) {
	  Set<Character> uniqueLetters = new HashSet<>();
	  
	  for(char c:input.toCharArray()) {
		  if(Character.isLetter(c)) {
			  uniqueLetters.add(c);
		  }
	  }
	  return uniqueLetters.size() == 26;
  }
}



