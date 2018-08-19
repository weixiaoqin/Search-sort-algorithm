package 剑指offer;

import java.util.HashMap;

//数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
//例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
//HashMap的key value分别存储 值和次数
public class N031数组中出现次数超过一半的数字 {
   public int solution(int [] a) {
	   if(a.length==0) {
		   return 0;
	   }
	   HashMap<Integer, Integer> map=new HashMap<>();
	   for(int i=0;i<a.length;i++) {
		   if(map.containsKey(a[i])) {
			   int n=map.get(a[i])+1;
			   map.put(a[i], n);
		   }
		   else {
			   map.put(a[i], 1);
		   }
		   if(map.get(a[i])>a.length/2) {
			   return a[i];
		   }
	   }
	   return 0;
   }
}
