package ��ָoffer;

import java.util.ArrayList;

//С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
//���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
//û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22�����ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
//������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��

///*
/*��ʼ��small=1��big=2;
*small��big���к�С��sum��big++; ����sum��small++;
*��small���ӵ�(1+sum)/2��ֹͣ
*/
public class N022��ΪS�������������� {
	 public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
		 ArrayList<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		 if(sum<=1) return lists;
		 int low=1;
		 int high=2;
		 
		 while(low<(1+sum)/2) {
			 int n=getsum(low,high);
			 if(n==sum) {
				 ArrayList<Integer> list=new ArrayList<>();
				 for(int i=low;i<=high;i++){
					 list.add(i);
				 }
				 lists.add(list);
				 low++;
				 high++;
			 }
			 else if(n<sum) {
				 high++;
			 }
			 else low++;
		 }
		 
		 return lists;
	 }
	 
	 public int getsum(int low,int high) {
		 int n=0;
		 for(int i=low;i<=high;i++) {
			 n+=i;
		 }
		 return n;
	 }
}
