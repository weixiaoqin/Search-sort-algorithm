package 查找排序算法;
//选择排序O(n*n) 不稳定
//选择排序是给每个位置选择当前元素最小的，比如给第一个位置选择最小的，在剩余元素里面给第二个元素选择第二小的，依次类推，直到第n - 1个元素，第n个元素不用选择了，
//因为只剩下它一个最大的元素了。那么，在一趟选择，如果当前元素比一个元素小，而该小的元素又出现在一个和当前元素相等的元素后面，那么交换后稳定性就被破坏了。
//举个例子，序列5 8 5 2 9，我们知道第一遍选择第1个元素5会和2交换，那么原序列中2个5的相对前后顺序就被破坏了，所以选择排序是一个不稳定的排序算法。
import java.util.*;
public class N04选择排序 {
	public static void main(String[] args) {
		int ar[]=new int[]{70,55,75,1,8};
		 int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		selectSort(ar);
		for(int i:ar) {
			System.out.println(i);
			// System.out.println(i+",");//用println打印出的数有问题
			 // System.out.print(i+",");
		}
	}
  public static void selectSort(int [] a) {
	  int n=a.length;
	  for(int i=0;i<n-1;i++) {
		  int min=i;//初始化最小的数
		  for(int j=i+1;j<n;j++) {
			  if(a[min]>a[j]) {//如果有比Min小的数，则小数的下标存到min
				  min=j;
			  }
		  }
		  int tem=a[min];//交换，把最小的数(下标为min=j)存到最前面(下标为i)
		  a[min]=a[i];
		  a[i]=tem;
	  }  
  }
  
  
}
