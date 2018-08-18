package 剑指offer;
//统计一个数字在排序数组中出现的次数。
//方法一，循环遍历
//方法2：二分法，找到，第一个K和最后一个K的位置，
public class N23数字在排序数组中出现的次数 {
  public int getNumOfK(int a[],int k) {
	  String s=a.
	  if(a.length ==0) return 0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
			} 
			if(a[i]>k) break;//大于k就结束循环
		}
		return count;
  }
}
