package ��ָoffer;
//��Ŀ����
//����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ�������ڵ����м�ֵ�����С���ұߴ�
//����������Yes,�������No���������������������������ֶ�������ͬ��
//BST�ĺ������еĺϷ������ǣ�����һ������S�����һ��Ԫ����x ��Ҳ���Ǹ��������ȥ�����һ��Ԫ�ص�����ΪT��
//��ôT���㣺T���Էֳ����Σ�ǰһ�Σ���������С��x����һ�Σ�������������x��
//�������Σ����������ǺϷ��ĺ������С������ĵݹ鶨�� : ) 
public class N025�����������ĺ���������� {
	 public boolean VerifySquenceOfBST(int [] sequence) {
		  if(sequence.length == 0) return false;
	        return IsTreeBST(sequence, 0, sequence.length-1);
	    }
	    public boolean IsTreeBST(int [] sequence,int start,int end ){
	        if(end <= start) return true;
	        int i = start;
	        for (; i < end; i++) {
	            if(sequence[i] > sequence[end]) break;
	        }
	        for (int j = i; j < end; j++) {
	            if(sequence[j] < sequence[end]) return false;
	        }
	        return IsTreeBST(sequence, start, i-1) && IsTreeBST(sequence, i, end-1);
	 }
}
