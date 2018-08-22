package 剑指offer;
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//【奇数和偶数的相对位置可以改变的前提下】可以用前后指针的方法
//题目扩展：负数位于正数前面；能被3整除的位于不能被3整除的后面 
public class N038调整数组顺序让奇数位于偶数前面 {
	public static void main(String[] args) {
		int a[]= {1,5,2,8,6,2,45,26,32,58,32,49,15};
		reorder(a);
		for(int i:a) {
			System.out.println(i);
		}
	}
  public static void reorder(int [] a) {//不要忘记声明返回类型void
	  int n=a.length;
	  int low=0;
	  int high=n-1;
	  while(low<high) {
//		  while(low<high&&a[low]%2==1)//如果a[low]是奇数a[low]&1==1，则前一个指针+1
//		  {
//			  low++;
//		  }
		  while(low<high&&a[low]%3==0)//如果a[low]被3整除，则前一个指针+1
		  {
			  low++;
		  }
//		  while(low<high&&a[high]%2==0)//如果a[high]是偶数a[high]&1==0，则后一个指针-1
//		  {
//			  high--;
//		  }
		  while(low<high&&a[high]%3!=0)//如果a[high]不能被3整除，则后一个指针-1
		  {
			  high--;
		  }
		  if(low<high) {//前面是偶、后面是奇数的，则交换两个数
			  int temp=a[low];
			  a[low]=a[high];
			  a[high]=temp;
		  }
	  }
  }
}
