package 剑指offer;

import java.util.HashMap;

//在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次
//请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
public class N027数组中重复的数字 {
	 public boolean duplicate(int numbers[],int length,int [] duplication) {
		 if(length<=0) return false;
		 HashMap<Integer, Integer> map=new HashMap<>();//利用哈希表来存数和次数
		 for(int i=0;i<numbers.length;i++) {
			 if(map.containsKey(numbers[i])) {//如果包含某个数
				 int t=map.get(numbers[i]);//取键值
				 t++;
				 map.put(numbers[i], t);
			 }
			 else map.put(numbers[i], 1);
		 }
		 
		 for(int i=0;i<numbers.length;i++) {
			 if(map.get(numbers[i])>=2) {//次数大于等于2
				 duplication[0]=numbers[i];
				 return true;
//				 break;
			 }
		 }
		 return false;
		 
	 }
}
