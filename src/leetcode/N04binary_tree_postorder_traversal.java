package leetcode;

import java.util.ArrayList;

import 剑指offer.TreeNode;

//binary-tree-postorder-traversal后序遍历
//Given a binary tree, return the postorder traversal of its nodes' values.

//For example:
//Given binary tree{1,#,2,3}, return[3,2,1].
////    1
//       \
//       2
//      /
//      3
//public class TreeNode {
//	  int val;
//	  TreeNode left=null;
//	  TreeNode right=null;
//	  public TreeNode(iny val) {
//		  this.val=val;
//	  }
//	}
public class N04binary_tree_postorder_traversal {
   public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        
        if(root==null) return list;
        else {
        	list.addAll(postorderTraversal(root.left));//递归的方法
        	ist.addAll(postorderTraversal(root.right));        	
   //     	list.addAll(root.right.val);
        	list.add(root.val);
        }
        return list;//不要忘了返回值
        
    }
}
