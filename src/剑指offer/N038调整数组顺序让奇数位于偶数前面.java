package ��ָoffer;
//����һ���������飬ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
//��������ż�������λ�ÿ��Ըı��ǰ���¡�������ǰ��ָ��ķ���
//��Ŀ��չ������λ������ǰ�棻�ܱ�3������λ�ڲ��ܱ�3�����ĺ��� 
public class N038��������˳��������λ��ż��ǰ�� {
	public static void main(String[] args) {
		int a[]= {1,5,2,8,6,2,45,26,32,58,32,49,15};
		reorder(a);
		for(int i:a) {
			System.out.println(i);
		}
	}
  public static void reorder(int [] a) {//��Ҫ����������������void
	  int n=a.length;
	  int low=0;
	  int high=n-1;
	  while(low<high) {
//		  while(low<high&&a[low]%2==1)//���a[low]������a[low]&1==1����ǰһ��ָ��+1
//		  {
//			  low++;
//		  }
		  while(low<high&&a[low]%3==0)//���a[low]��3��������ǰһ��ָ��+1
		  {
			  low++;
		  }
//		  while(low<high&&a[high]%2==0)//���a[high]��ż��a[high]&1==0�����һ��ָ��-1
//		  {
//			  high--;
//		  }
		  while(low<high&&a[high]%3!=0)//���a[high]���ܱ�3���������һ��ָ��-1
		  {
			  high--;
		  }
		  if(low<high) {//ǰ����ż�������������ģ��򽻻�������
			  int temp=a[low];
			  a[low]=a[high];
			  a[high]=temp;
		  }
	  }
  }
}
