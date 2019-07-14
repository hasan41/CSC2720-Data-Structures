import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

/*@author: Hasan Naseer
 * Lab 2_Extra Credit - CSC 2720
 * June 21, 2019  */

public class Lab2_EC {
	public static void main (String[] args) {
		String s1 = "radar"; //String assigned with 's1' variable
		String s2 = "12342"; //Extra String assigned with 's2'
		
		boolean ans = checkPalindrome(s1);
		boolean ans2 = checkPalindrome(s2);
		System.out.println("String " + "'"+ s1 + "'" + " is: " + ans); //returns true
		System.out.println("String " + "'"+ s2 + "'" + " is: " + ans2); //returns false;
	}
	
	public static boolean checkPalindrome(String s1) {
		 
       Stack<Character> s = new Stack<Character>();  //Declared a Stack interface as instructed by instructor
       Queue<Character> q = new LinkedList<Character>();
       
       char l;  //A duplicate character to check if characters in the string are same
		
		for(int n=0; n<s1.length();n++) { /*Loops through the string given above in the main method  
		 								   * and then pushes the character to the Stack of string given 
		 								   * above. Similarly adds the Queue of chars in the string */
			s.push(s1.charAt(n));
			l = s1.charAt(n);
	        q.add(l); 
		}
		
		while(!q.isEmpty()) {                 /*So when Queue is NOT empty then if stack is removed and Queue
		 										* too, then return true since both characters are same then
		 										* so there is no need to keep them in the String.*/
			if(s.pop() == q.poll()) {
				return true;
			}else {
				return false;
			}
		}
		return true; //Always returns a boolean object (true || false) since it is a static method.
	}
} 
		
		


