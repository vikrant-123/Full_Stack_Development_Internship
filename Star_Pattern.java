package star_Pattern;

import java.util.*;


public class Star_Pattern {

  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in); 
    System.out.println("Enter the Rows: ");
    String inputLine = s.nextLine(); 
    myCode(inputLine);
    s.close();
  }
  public static void myCode(String str) {
	  int rows = Integer.parseInt(str);
	  for(int i=1;i<=rows;i++) {
		  for(int j=1;j<=rows-i;j++) {
			  System.out.print(" ");
		  }
		  for(int k=1;k<=2*i-1;k++) {
			  System.out.print("*");
		  }
		  System.out.println();
	  }
  }
}



