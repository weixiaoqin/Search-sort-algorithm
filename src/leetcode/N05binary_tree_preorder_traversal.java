package leetcode;

import java.util.ArrayList;

//Given a binary tree, return the preorder traversal of its nodes' values.
////1
//   \
//   2
//   /
//  3
//return[1,2,3].ºóĞò±éÀú
public class N05binary_tree_preorder_traversal {
	 public ArrayList<Integer> preorderTraversal(TreeNode root) {
	        ArrayList<Integer> list=new ArrayList<>();
	        if(root==null) return list;
	        else {
	        	list.add(root.val);
	        	list.addAll(preorderTraversal(root.left));
	        	list.addAll(preorderTraversal(root.right));
	        	
	        }
	        return list;
	    }
}
