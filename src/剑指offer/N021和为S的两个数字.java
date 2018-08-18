package 剑指offer;
//输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
//如果有多对数字的和等于S，输出两个数的乘积最小的。
//对应每个测试案例，输出两个数，小的先输出。

import java.lang.reflect.Array;
import java.util.ArrayList;
//[如果没有排序，先排序]
////开始还在纠结乘积最小，后来转念一想，a+b=sum,a和b越远乘积越小，而一头一尾两个指针往内靠近的方法找到的就是乘积最小的情况。
//如果是乘积最大的情况就是一直找到两个指针重合，每次找到一个就将之前返回的结果向量清空然后更新为新找到的。[考虑栈，后进先出]
public class N021和为S的两个数字 {
	  public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        ArrayList<Integer> list=new ArrayList<>();
	        if(array.length<2) {
	        	return list;
	        }
	        int low=0;
	        int high=array.length-1;
	        while(low<high) {
	        	if(array[low]+array[high]==sum) {
	        		list.add(array[low]);
	        		list.add(array[high]);
	        		break;
	        	}
	        	else if(array[low]+array[high]>sum) {
	        		high--;
	        	}
	        	else low++;
	        }
	        
	        return list;
	    }
}
