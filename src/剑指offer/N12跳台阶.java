package 剑指offer;
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。
//求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。循环和递归

/*ok 递归方法
  public class N12跳台阶 {
 
	public int f(int n) {
		if(n==1||n==2) {
			return n;
		}
		return f(n-1)+f(n-2);
		
	}

}
*/
//循环，定义数组的方法
public class N12跳台阶 {
	 
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
	return a[n-1];//不能用a[i]，超出i作用域范围
		
	}

}

