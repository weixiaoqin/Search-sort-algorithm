package leetcode;


//Given a binary tree, find its minimum depth.
//The minimum depth is the number of
//nodes along the shortest path from the root node down to the nearest leaf node.
//������������·������.�õݹ�ķ���
//public class TreeNode {
//	  int val;
//	  TreeNode left=null;
//	  TreeNode right=null;
//	  public TreeNode(iny val) {
//		  this.val=val;
//	  }
//	}

public class N02minimum_depth_of_binary_tree {
public int run(TreeNode root) {
        if(root==null) {
        	return 0;
        }
        int left=run(root.left);
    	int right=run(root.right);
    	if(left==0) {//Ҫ���жϸ��ڵ�����������Ƿ�Ϊ�գ�
    		return right+1;
    	}
    	if(right==0) {
    		return left+1;
    	}
    	return Math.min(left, right)+1;
//        else {
//        	int left=run(root.left);//Ҫ���жϸ��ڵ�����������Ƿ�Ϊ�գ�
//        	int righ=run(root.right);
//        	return Math.min(left, right)+1;
//        }
        
    }
}
