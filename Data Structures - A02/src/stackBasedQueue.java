import java.util.Stack;

/* @author - Hasan Naseer
 * CSC 2720 (Data Structures) - Assignment 02
 * July 05, 2019 */

public class stackBasedQueue {
	   Stack<Integer> stack1;   
	   Stack<Integer> stack2;
	  
	   public stackBasedQueue(){
	       stack1 = new Stack<Integer>();
	       stack2 = new Stack<Integer>();
	   }
	  
	   public boolean isEmpty(){    /* *When stack1 and 2 are Empty then return true since that's what function wants */
		   if(stack1.isEmpty() && stack2.isEmpty()) {   
				return true;
			}
			return false;
		}	
	  
	   public void enqueue(int newItem){
	       if(stack2.size() > 0){
	           int cur = 0;
	           for(int i=0;i<stack2.size();i++){
	               cur = stack2.pop();
	               stack1.push(cur); //Whenever stack2 will pop or remove then stack1 will push or add the cur value
	           }
	       }
	       stack1.push(newItem);
	   }
	  
	   public int dequeue() throws QueueException{   /* *If stack2 is not empty then stack2's first element 
	   												    *in the list will delete (pop). If stack 2 is empty 
	   												    *then it will throw QueueException. If stack1 size is
	   												    *equal to 1 then it deletes last element in stack 1 and continues */
	       if(!stack2.isEmpty()){
	           return stack2.pop();  // Stack2 is not empty then stack2's first element in the list will delete (pop)
	       }else if(stack2.isEmpty()){
	    	   throw new QueueException("You can't DEQUEUE on an EMPTY queue :(");  
	           }else if(stack1.size() == 1)
	               return stack1.pop();
	           else if(stack1.size() > 0){
	               int cur = 0;
	               for(int i=0;i<stack1.size();i++){
	                   cur = stack1.pop();
	                   stack2.push(cur);
	               }
	               return stack2.pop(); //If stack1 size is less than 0, then stack 2 pops or deletes the last element
	           }
	       return 0;  //returns a number since its a type (int) function
	   }
	  
	   public void dequeAll(){       /* * When stack1 and stack2 are NOT Empty then stack 1 and 2 
	   									* deletes all of its elements in the list. This function makes
	   									* the list empty and returns null */
	       if(!stack1.isEmpty()) {
	           stack1.pop();
	       }
	       if(!stack2.isEmpty()) {
	           stack2.pop();
	       }
	   }
	  
	   public int peek() throws QueueException{  /* * If stack2 is not empty then stack2's first element 
	   												* in the list will peek or give the output. If stack 2 and
	   												* stack 1 is empty then it will throw QueueException. 
	   												* If stack1 size is not empty then it continues to the for loop */
		   if(!stack2.isEmpty()){
			   return stack2.peek(); 
		   }else if(stack2.isEmpty() && stack1.isEmpty()) {  
			   throw new QueueException("You can't PEEK on an EMPTY queue :(");
		   }else if(stack1.size() == 1) {  
			   return stack1.peek();
		   }else if(stack1.size() > 0){
			   int n = stack1.size();
               int cur = 0;
               for(int i=0;i<n;i++){
                   cur = stack1.pop();
                   stack2.push(cur);
               }
               return stack2.peek();
		   }
		   return 1; //returns a number since its a type (int) function
	   }
	  
	   public static void main(String args[]){
	       stackBasedQueue q = new stackBasedQueue();
	       q.enqueue(1);
	       q.enqueue(2);
	       q.enqueue(3);
	       System.out.println("Ans#1: "+q.peek());   //Should return 1
	      
	       q.dequeue();
	       q.dequeue();
	       System.out.println("Ans#2: "+q.peek());  //Should return 3
	       System.out.println("Ans#3: "+q.isEmpty()); //Return false
	      
	       q.dequeAll();  
	       System.out.println("Ans#4: "+q.isEmpty()); //Return true
	       System.out.println("Ans#5: "+q.peek());  //Should throw exception with message: "You can not PEEK on an EMPTY queue :("
	   } 
	   
	   public class QueueException extends java.lang.RuntimeException{
		   public QueueException(String s){
		       super(s);
		   }
		}
}


