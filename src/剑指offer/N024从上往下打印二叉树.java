package 剑指offer;
//从上往下打印出二叉树的每个节点，同层节点从左至右打印。

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class N024从上往下打印二叉树 {
	public ArrayList<Integer> print(TreeNode root){
		ArrayList<Integer> list=new ArrayList<>();
		if(root==null) {
			return list;
		}
		
	 Queue<TreeNode> q=new LinkedList<>(); //链表队列
	 q.add(root);
		TreeNode n;
		while(!q.isEmpty()) {
			n=q.poll();
			list.add(n.val);
			if(n.left!=null) {
				q.add(n.left);
			}
			if(n.right!=null) {
				q.add(n.right);
			}
		}
		return list;
	}

}
