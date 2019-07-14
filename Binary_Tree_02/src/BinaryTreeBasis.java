public abstract class BinaryTreeBasis<T> {
  protected TreeNode<T> root;

  public BinaryTreeBasis() {
    root = null;
  }  // end default constructor

  public BinaryTreeBasis(T rootItem) {
    root = new TreeNode<T>(rootItem, null, null);
  }  // end constructor

  public boolean isEmpty() {
  // Returns true if the tree is empty, else returns false.
    return root == null;
  }  // end isEmpty

  public void makeEmpty() {
  // Removes all nodes from the tree.
    root = null;
  }  // end makeEmpty

  public T getRootItem() throws TreeException {
  // Returns the item in the trees root.
    if (root == null) {
      throw new TreeException("TreeException: Empty tree");
    }
    else {
      return root.getItem();
    }  // end if
  }  // end getRootItem

  public abstract void setRootItem(T newItem); 
    // Throws UnsupportedOperationException if operation
    // is not supported. 
  
  public String getInorder() {
      return getInorder(root);   
  }
  private String getInorder(TreeNode<T> tree) {   //private string, following getInorderString above
      if(tree == null) {  //If tree is null then return an empty string
          return "";
      } else {
          return getInorder(tree.getLeft()) + tree.getItem().toString() + getInorder(tree.getRight()); /* * Inorder Traversal method: leftNode(call Inorder)
                              																			  *                           visit root
                              																			  *                           rightNode(call Inorder) */
      }  
  } // end BinaryTreeBasis
}
