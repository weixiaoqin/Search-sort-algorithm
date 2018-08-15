package 剑指offer;
//方法1：排序求最小值
//方法二：二分查找思想
public class N10旋转数组的最小数字 {
 public int minOfNum(int array[]){
	 if(array.length==0) return 0;
	 int min=array[0];
	 for(int i=1;i<array.length;i++) {
		 if(min>array[i]) {
			 min=array[i];
		 }
	 }
	 return min;
 }
}
