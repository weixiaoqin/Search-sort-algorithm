package ��ָoffer;
//����һ�ö��������жϸö������Ƿ���ƽ���������
public class N045ƽ������� {
	  public boolean IsBalanced_Solution(TreeNode root) {
	        if (root == null) {
	            return true;
	        }
	        int left = getTreeDepth(root.left);
	        int right = getTreeDepth(root.right);
	        int diff = left - right;
	        if (diff > 1 || diff < -1)
	            return false;
	        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
	         
	    }
	     
	     
	    public  int getTreeDepth(TreeNode root) {
	        if (root == null)
	            return 0;
	        else
	            return Math.max(getTreeDepth(root.left), getTreeDepth(root.right)) + 1;
	 
	    }	
}
