public class TreeTraversal {
	public static void main(String[]args) {
		BinaryTree<Character> tree1 = new BinaryTree<Character>();
		BinaryTree<Character> rightsubtree1= new BinaryTree("X"); 
		rightsubtree1.attachRight('Y');
		BinaryTree<Character> leftsubtree1= new BinaryTree("D");
		leftsubtree1.attachLeft('B');
		BinaryTree<Character> leftsubtree2= new BinaryTree("F");
		leftsubtree2.attachRight('G');
		leftsubtree2.attachLeft('E');
		
		leftsubtree1.attachRightSubtree(leftsubtree2);
		tree1.attachLeftSubtree(leftsubtree1); 
		tree1.attachRightSubtree(rightsubtree1);
		BinaryTree<Character> tree2 = new BinaryTree("F");
		// BUILD tree2 HERE
		
		
		BinaryTree<Character> rightsub2= new BinaryTree("I"); 
		rightsub2.attachLeft('H');
		BinaryTree<Character> rightsub1= new BinaryTree("G"); 
		rightsub1.attachRightSubtree(rightsub2);
		BinaryTree<Character> leftsub1= new BinaryTree("B");
		leftsub1.attachLeft('A');
		BinaryTree<Character> leftsub2= new BinaryTree("D");
		leftsub2.attachRight('E');
		leftsub2.attachLeft('C');
		
		leftsub1.attachRightSubtree(leftsub2);
		tree2.attachLeftSubtree(leftsub1); 
		tree2.attachRightSubtree(rightsub1);
		
		
		
		
		System.out.println(checkSkipped(tree1)); // Should return true 
		System.out.println(checkSkipped(tree2));  // Should return false
	

	}
	
	public static boolean checkSkipped(BinaryTree<Character> tree){ 
		/* // To Iterate a tree using Inorder Traversal
		TreeIterator<Character> iter = new TreeIterator<Character>(tree); iter.setInorder();
		while (iter.hasNext()){
		System.out.print (iter.next()); }
		*/
		return false; 
	}
}
