package ��Ϊ;
//����һ��int�͵����������������int���������ڴ��д洢ʱ1�ĸ�����

import java.util.Scanner;

public class H14��int�����������ڴ��д洢ʱ1�ĸ���{
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		System.out.println(result(n));
	}
}
 /* public static int result(int n) {
	  String s=Integer.toBinaryString(n);
	  int sum=0;
	  for(int i=0;i<s.length();i++) {
		  if(s.charAt(i)=='1') {
			  sum++;
		  }
	  }
	  return sum;
  }
  */
  public static int result(int n) {
	  int sum=0;
	  while(n!=0) {
		  n=n&(n-1);
		  sum++;
	  }
	  return sum;
  }
  
}
