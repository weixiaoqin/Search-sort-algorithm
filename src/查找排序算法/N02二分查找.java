package 查找排序算法;
//二分查找【折半查找】是一种查询效率非常高的查找算法。又称折半查找。[前提：有序表]
//。折半查找的基本思想是:在有序表中，取中间记录作为比较对象，若给定值与中间记录的关键字相等，则查找成功;
//若给定值小于中间记录的关键字，则在中间记录的左半区继续查找;若给定值大于中间记录的关键字，则在中间记录的右半区继续查找。
//优点是比较次数少，查找速度快，平均性能好；
//其缺点是要求待查表为有序表，且插入删除困难。
//因此，折半查找方法适用于不经常变动而查找频繁的有序列表。

///*首先，我们将数组的查找过程绘制成一棵二叉树，如果查找的关键字不是中间记录的话，折半查找等于是把静态有序
//查找表分成了两棵子树，即查找结果只需要找其中的一半数据记录即可，等于工作量少了一半，然后继续折半查找，效率当然是非常高了。
//根据二叉树的性质4，具有n个结点的完全二叉树的深度为[log2n]+1。在这里尽管折半查找判定二叉树并不是完全二叉树，
//但同样相同的推导可以得出，最坏情况是查找到关键字或查找失败的次数为[log2n]+1，最好的情况是1次。

//最终我们折半算法的时间复杂度为O(logn)，它显然远远好于顺序查找的O(n)时间复杂度了
/*public class N02二分查找 {//循环实现
  public int binarySearch(int a [],int key) {
	  if(a.length==0) return -1;
	  int low,high,mid;
	  low=0;
	  high=a.length-1;
	  
	  while(low<=high) {
		  mid=(low+high)/2;
		  if(a[mid]==key) {//相等则返回mid
			  return mid;
		  }
		  else if(a[mid]<key) {//关键字在Mid的右边，
			  low=mid+1;
		  }
		  else { //关键字在Mid的左边
			  high=mid-1;
		  }
	  }
	  
	  return -1;
  }
}*/

public class N02二分查找 {//递归实现
	  public int binarySearch(int a [],int key,int low,int high) {
		  if(a.length==0||low<high||a[low]>key||a[high]<key) return -1;
		   int mid=(low+high)/2;
			  
			  if(a[mid]==key) {//相等则返回mid
				  return mid;
			  }
			  else if(a[mid]<key) {//关键字在Mid的右边，
				  return binarySearch(a,key,mid+1,high);
			  }
			  else { //关键字在Mid的左边
				  return binarySearch(a,key,low,mid-1);
			  }
		  
		  return -1;
	  }
	}
