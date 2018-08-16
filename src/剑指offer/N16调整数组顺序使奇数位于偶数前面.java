package 剑指offer;

import java.util.ArrayList;

//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
//使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
//并保证奇数和奇数，偶数和偶数之间的相对位置不变。
public class N16调整数组顺序使奇数位于偶数前面 {
	 public void reOrderArray(int [] array) {
	        ArrayList<Integer> one=new ArrayList<>();
	        ArrayList<Integer> two=new ArrayList<>();
	        int n=array.length ;
	        for(int i=0;i<n;i++){//两个链表分别存奇数、偶数
	        	int t=array[i];
	        	if(t%2==1) {
	        		one.add(t);
	        	}
	        	else if(t%2==0) {
	        		two.add(t);
	        	}
	        }
	        int m=0;
	        for(int i=0;i<one.size();i++) {
	        	array[m]=one.get(i);
	        	m++;
	        }
	        for(int j=0;j<two.size();j++) {
	        	array[m]=two.get(j);
	            m++;
	        }
}
}

/*类似于冒泡排序；前面是偶数，后面是奇数，则交换
public class Solution {
    public void reOrderArray(int [] array) {
       for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
}
