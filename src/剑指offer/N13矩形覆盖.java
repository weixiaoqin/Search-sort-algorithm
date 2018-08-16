package 剑指offer;
//题目描述
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
//请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
//若第一次，竖着排，剩下有f(n-1)种；
//若第一次，横着排，剩下有f(n-2)种；所以f(n)=f(n-1)+f(n-2)
public class N13矩形覆盖 {
  public int cover(int n) {
	  if(n<=0) {
		  return 0;
	  }
	  else if(n==1||n==2) {
		  return n;
	  }
	  else {
		  return cover(n-1)+cover(n-2);
	  } 
  }
}
