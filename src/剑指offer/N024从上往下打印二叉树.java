package ��ָoffer;
//�������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class N024�������´�ӡ������ {
	public ArrayList<Integer> print(TreeNode root){
		ArrayList<Integer> list=new ArrayList<>();
		if(root==null) {
			return list;
		}
		
	 Queue<TreeNode> q=new LinkedList<>(); //�������
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
