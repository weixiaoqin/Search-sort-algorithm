package ��ָoffer;
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
//�����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������ѭ���͵ݹ�

/*ok �ݹ鷽��
  public class N12��̨�� {
 
	public int f(int n) {
		if(n==1||n==2) {
			return n;
		}
		return f(n-1)+f(n-2);
		
	}

}
*/
//ѭ������������ķ���
public class N12��̨�� {
	 
	public int f(int n) {
		if(n==1||n==2) {
			return n;
		}
	int a []=new int[n];
	a[0]=1;
	a[1]=2;
	for(int i=2;i<n;i++) {
		a[i]=a[i-1]+a[i-2];
	}
	return a[n-1];//������a[i]������i������Χ
		
	}

}

