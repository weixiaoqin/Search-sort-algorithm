package ��ָoffer;
//����1����������Сֵ
//�����������ֲ���˼��
public class N10��ת�������С���� {
 public int minOfNum(int array[]){
	 if(array.length==0) return 0;
	 int min=array[0];
	 for(int i=1;i<array.length;i++) {
		 if(min>array[i]) {
			 min=array[i];
		 }
	 }
	 return min;
 }
}
