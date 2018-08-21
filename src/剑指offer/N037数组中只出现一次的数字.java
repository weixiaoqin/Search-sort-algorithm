package 剑指offer;

//一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。请写程序找出这两个只出现一次的数字。

//第一次扫描数组用哈希表保存数字出现的次数，第二次扫描数组找出出现次数为1的
import java.util.HashMap;

public class N037数组中只出现一次的数字 {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	 HashMap<Integer, Integer> map=new HashMap<>();
	    for(int i=0;i<array.length;i++) {
	    	int n=array[i];
	    		if(map.containsKey(n)) {
	    			int t=map.get(n);
	    			t++;
	    			map.put(n, t);//次数累加
	    		}
	    		else map.put(n, 1);//之前没有存储的字符
	   	}
	    int flag=1;
	    for(int i=0;i<array.length;i++) {
	    	if(map.get(array[i])==1&&flag==1) {
	    		num1[0]=array[i];
	    		flag=0;
	    	}
	    	else if(map.get(array[i])==1&&flag==0) {//注意：要加，else if，不能单独用if，否则是顺序执行，结果不正确num1[0]==num2[0]
	    		num2[0]=array[i];
	    		break;
	    	}
	    		
	    }
	    
	 }
}
