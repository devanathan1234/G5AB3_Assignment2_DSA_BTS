package com.greatlearning.gradcoas2;

public class BinarySearchTree {
	class Node {
	    int key;
	    Node left, right;

	    public Node(int item) {
	      key = item;
	      left = right = null;
	    }
	  }

	  public Node root;

	  BinarySearchTree() {
	    root = null;
	  }

	  void insert(int key) {
	    root = insertKey(root, key);
	  }
	  void inorder() {
		    inorderRec(root);
		  }

		  // Inorder Traversal
		  void inorderRec(Node root) {
		    if (root != null) {
		      inorderRec(root.left);
		      System.out.print(root.key + " -> ");
		      inorderRec(root.right);
		    }
		  }


	  private Node insertKey(Node root2, int key) {
		// TODO Auto-generated method stub
		return null;
	}

	// Driver Program to test above functions
	  public static void main(String[] args) {
	    BinarySearchTree tree = new BinarySearchTree();

	
		        tree.insert(50);
		        tree.insert(30);
		        tree.insert(10);
		        tree.insert(60);
		        tree.insert(55);
		        
		        System.out.print("Inorder traversal: ");
		        tree.inorder();

		    }

	public void itl(Node root2) {
		// TODO Auto-generated method stub
		
	}

}

		           
				
	



