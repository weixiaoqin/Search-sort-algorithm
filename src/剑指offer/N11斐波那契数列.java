package ��ָoffer;
//�ݹ鷽��
//ѭ������
//��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
//n<=39
public class N11쳲��������� {
	 public int Fibonacci(int n) {
	      if(n<=0||n==1) {
			  return n;
		  }
		  
			  return Fibonacci(n-1)+Fibonacci(n-2);
		  
	    }
}
/*
public class Solution {
    public int Fibonacci(int n) {
    if(n<=0||n==1) {
		  return n;
	  }
        
      int a[]=new int[n+1];
       a[0]=0;
       a[1]=1;
	  for(int i=2;i<a.length;i++){
          a[i]=a[i-1]+a[i-2];
      }
	  return a[n];
    }
    
}
*/