package ��ָoffer;
//����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
//���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//�����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

import java.util.ArrayList;

public class N20˳ʱ���ӡ���� {
  public ArrayList<Integer> printMatrix(int a[][]){
	  int n=a.length;
	  int m=a[0].length;
	   ArrayList<Integer> list=new ArrayList<>();
	   
	   int layers=n/2+n%2;
	   for(i=0;i<layers;i++) {//�����Ĳ���
		   for(int j=i;j<m-i;j++) {//��������a[0][0]-a[0][m]
			   list.add(a[i][j]);
		   }
		   for(int k=i+1;k<n-1-i;k++) {//���ϵ�����
			   list.add(a[k][m-i]);
		   }
		   for(int j=m-2-i;j>=i;j--) {//�����£���������
			   list.add(a[n-1-i][k]);
		   }
		   for(int k=n-2-i;k<=i+1;k++) {//���µ���
			   list.add(a[k][i]);
		   }
	   }
	   return list;
	   
	  
  }
}
