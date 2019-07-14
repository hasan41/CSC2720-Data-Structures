import java.util.Stack; //One import statement as instructed by the instructor 

/*@author: Hasan Naseer
 * Lab 2 - CSC 2720
 * June 21, 2019  */

public class Lab2 {
	public static void main(String[]args) {
		String s1 = "DataStructuresIssss###Fun"; //Creates a String variable called 's1' and declared '#' in it.
		String s2 = "DataStructuresIszwp###Fun";
		
		String s3 = "Hello##"; 
		String s4 = "He#llo";
		
		boolean ans = backspaceCompare(s1,s2); //Return true
		boolean ans2 = backspaceCompare(s3,s4); //Prints out False
		
		System.out.println("First String " + "'"+ s1 + "'" + " & " + "'"+ s2 + "'" + " is: " + ans); 
		System.out.println("First String " + "'"+ s3 + "'" + " & " + "'"+ s4 + "'" + " is: " + ans2); 
	}
	public static boolean backspaceCompare(String s1, String s2) { /* Both Strings should have an equal pop methods
	 																* and equal size strings since they both should be
	 																* same strings with extra '#' inside them. But that
															        * varies and are going to be removed by the code given below.*/
		Stack<Character> s1_stack = new Stack<Character>();
		Stack<Character> s2_stack = new Stack<Character>();
		
		//Same code for the s2_stack also since they both are being loop together. 
		for(char i: s1.toCharArray()) {
			if(i == '#') {
				if(!s1_stack.isEmpty()) {
					s1_stack.pop();
				}
			}
			else
				s1_stack.push(i);
			
		}
		
		//For the Second String
		for(char i : s2.toCharArray()) { /* Creates a character and then loops
		 								  * through the String (s2) in an array
		 								  *  given by the user above */
			
			if(i == '#') {   /* If '#' found in the string and if string is not 
			 				 *  empty then pop the specific character out of string.
			 				 *   Else, then push the character inside the stack.*/
				if(!s2_stack.isEmpty()) {
					s2_stack.pop();
				}
				}
			else {
				s2_stack.push(i);
			}
		}
		
		if(s1_stack.size() != s2_stack.size()) { //Both Strings should have an equal size.
			return false;
		}
		

		int n=0;
		while(n<s1_stack.size()) {                   /* Loops through the String (s1) in a stack and
		 											  * if s1 characters are not removed from the string
		 											  *  as s2, then it will return false and vice versa */
			if(s1_stack.pop() != s2_stack.pop()) {
				return false; //If first string does not pop as second string stack then return false
			}
			n++;
		}
		return true;
	}
		}
		

