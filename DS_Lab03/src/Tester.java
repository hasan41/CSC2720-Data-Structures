/* *@author - Hasan Naseer
   * @category Data Structures -- CSC 2420 
   * Lab 03 - Node */

public class Tester {
	
	public static void main(String[]args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		//Node tail = new Node(4); //Commented since instructor gave to print 3 Nodes 
		
		head.next = second; //Head node connects with the second Node
		second.next = third;
		//third.next = tail; //Last node 
		
		System.out.println("List Before Deletation");
		printLinkedList(head);
		
		 deleteAtIndex(2,head); //Deletes Index 2 from the list 
		 System.out.println("List After Deletion at index 2"); //Deletes 3
		 printLinkedList(head);
		 deleteAtIndex(1,head); //Deletes Index 1 from the list 
		 System.out.println("List After Deletion at index 1"); //Deletes 2 
		 printLinkedList(head);
	}
	
	public static void deleteAtIndex(int value, Node head) {  /*Creates a cur node and set it equal to head
	 														   * and set the prev equal to null since prev is
	 														   * declared as the last node of the list */
	
		Node prev, cur;
		int counter = 0;
		cur = head;  
		prev  = null; 
		
		for(int i=0; i<cur.item;i++) {       /* *Loop through the node of 3 items given above and find the given
		 										* deletd item by continuing to the if statement. Which means that if
		 										* head is not the end of the Node || null && counter is less than value,
		 										* then prev is equal to cur and cur will move the the next item in the node*/
		
			if(cur!=null && counter < value) { 
				prev = cur;
				cur = cur.next;
				counter++;
			}
		}
		    if (cur != null && prev == null) {  //If head is not Null and prev is null then return another if statement
		        // Delete (cur) head.
		        if (cur.next != null) {
		            head = cur.next;      // Move head to next value.
		        }
		        else {
		            head = null; // Set head to null as list given is empty
		        }
		    }
		    else if (cur != null) { //If head is not null then delete cur
		        prev.next = cur.next;
		    }
	}
	
	public static void printLinkedList(Node head) {  /* Provided by Instructor */
		for(Node cur=head; cur!=null; cur=cur.next){
			System.out.print(cur.item+" ");
			}
		System.out.println();
	}
}
