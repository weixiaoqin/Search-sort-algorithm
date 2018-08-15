package 剑指offer;
//递归方法
//循环方法
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
public class N11斐波那契数列 {
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