public class TreeTraversal {
	/* * @author - Hasan Naseer
	   * CSC 2720 - Lab 04
	   * July 07, 2019 */
	
	public static void main(String[] args){
		// Create a tree called tree1 
		BinaryTree<Character> tree1 = new BinaryTree("H");
		
		BinaryTree<Character> rightsubtree1 = new BinaryTree("X");   
		rightsubtree1.attachRight('Y');     
		
		BinaryTree<Character> leftsubtree1 = new BinaryTree("D");  
		leftsubtree1.attachLeft('B');      
		
		BinaryTree<Character> leftsubtree2 = new BinaryTree("F");  
		leftsubtree2.attachRight('G');     
		leftsubtree2.attachLeft('E');      
		
		leftsubtree1.attachRightSubtree(leftsubtree2);
		tree1.attachLeftSubtree(leftsubtree1);
		tree1.attachRightSubtree(rightsubtree1);
				

		BinaryTree<Character> tree2 = new BinaryTree("F");
		// 
		//    BUILD tree2 HERE:
		//
		BinaryTree<Character> leftSubtree01 = new BinaryTree("B");
		leftSubtree01.attachLeft('A');
		
		BinaryTree<Character> leftSubtree02 = new BinaryTree("D");
		leftSubtree02.attachRight('E');
		leftSubtree02.attachLeft('C');
	 
		BinaryTree<Character> rightSubtree01 = new BinaryTree("G");

		BinaryTree<Character> rightSubtree02 = new BinaryTree("I");
		rightSubtree02.attachLeft('H');

		rightSubtree01.attachRightSubtree(rightSubtree02);
		leftSubtree01.attachRightSubtree(leftSubtree02);

		tree2.attachLeftSubtree(leftSubtree01);
		tree2.attachRightSubtree(rightSubtree01);		
		
		System.out.println(" " + "Tree 1: " +checkSkipped(tree1)); // Should return true
		System.out.println( " " + "Tree 2: " + checkSkipped(tree2)); // Should return false
		
	}
	
	public static boolean checkSkipped(BinaryTree<Character> tree){  
		//   To Iterate a tree using Inorder Traversal
		TreeIterator<Character> iter = new TreeIterator<Character>(tree);
		iter.setInorder();
		while (iter.hasNext()){
			System.out.print (iter.next());  //Prints character after character of alphabet characters
		} 		
 		
		// INSERT CODE HERE
		String inorder = tree.getInorder();  //getInorderString is given method in the BinaryTreeBasis.java 

    if(inorder.length() < 1) {    /* * If String inOrder length is less than and equal to 1 
    									 * then return true since string contains 1 char */ 
        return true;
    }

    Character end = inorder.charAt(0);
    boolean bol = true;   //Sets the initial Boolean statement to true
    for(int i=1; i<inorder.length(); i++) {   //Loops the String of nodes starting from 1 till the 2nd last char in the string
        char n = inorder.charAt(i);    

        if (n - end != 1) {    //When String (of end char - char at i) is not equal to one then return true and continues the for loop
            return bol;
        }
        end = n;
    }		
		return (bol == false); //return false if the if statements are not true in the loop of inorder Node
	}

}