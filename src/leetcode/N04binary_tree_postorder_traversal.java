package leetcode;

import java.util.ArrayList;

import ��ָoffer.TreeNode;

//binary-tree-postorder-traversal�������
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
        	list.addAll(postorderTraversal(root.left));//�ݹ�ķ���
        	ist.addAll(postorderTraversal(root.right));        	
   //     	list.addAll(root.right.val);
        	list.add(root.val);
        }
        return list;//��Ҫ���˷���ֵ
        
    }
}
