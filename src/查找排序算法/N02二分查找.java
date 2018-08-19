package 查找排序算法;
//二分查找是一种查询效率非常高的查找算法。又称折半查找。[前提：有序表]
//优点是比较次数少，查找速度快，平均性能好；
//其缺点是要求待查表为有序表，且插入删除困难。
//因此，折半查找方法适用于不经常变动而查找频繁的有序列表。
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
