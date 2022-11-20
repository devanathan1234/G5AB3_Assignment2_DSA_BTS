package com.greatlearning.gradcoas2;

public class BSTNode {
	
		public static void main(String[] args) {
			 BSTNode tree = new BSTNode();
		     tree.node = new Node(50);
		     tree.node.left = new Node(30);
		     tree.node.right = new Node(60);
		     tree.node.left.left = new Node(10);
		     tree.node.right.left = new Node(40);
		    
		     int order = 0;
		     tree.createSkewedTree(tree.node, order);
		     System.out.println("The Converted Binary Search Tree Into A Skewed Tree Is: ");
		     tree.traverseRightSkewed(tree.headNode);
		}

	}

}
