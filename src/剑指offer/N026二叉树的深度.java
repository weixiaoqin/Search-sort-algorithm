package ��ָoffer;
//����һ�ö�����������������
//�Ӹ���㵽Ҷ������ξ����Ľ�㣨������Ҷ��㣩�γ�����һ��·�����·���ĳ���Ϊ������ȡ�
//�ݹ��˼·��
public class N026����������� {
  public int TreeDepth(TreeNode root) {
	  if(root==null) {
		  return 0;
	  }
	  int left=TreeDepth(root.left);
	  int right=TreeDepth(root.right);
	  if(left>right) return left+1;
	  else return right+1;
  }
}
