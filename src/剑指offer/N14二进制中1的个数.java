package ��ָoffer;
//����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��

public class N14��������1�ĸ��� {
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
