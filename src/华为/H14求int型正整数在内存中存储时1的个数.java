package 华为;
//输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。

import java.util.Scanner;

public class H14求int型正整数在内存中存储时1的个数{
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
