package 剑指offer;
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public class N14二进制中1的个数 {
  public int num(int n) {
	  int num=0;;
	  while(n!=0) {
		  n=(n-1)&n;
		  num++;
	  }
	  return num;
  }
}

/*import java.util.*;
public class Solution {
public int NumberOf1(int n) {
 int count=0;
    String s1=Integer.toBinaryString(n);
    char [] a=s1.toCharArray();
    for(int i=0;i<a.length;i++){
        if(a[i]=='1'){
            count++;
        }
    }
    return count;
    
}
}*/
