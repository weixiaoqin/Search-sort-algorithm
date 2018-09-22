package 华为;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//题目描述
//输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
//
//输入描述:
//输入一个int型整数
//
//输出描述:
//按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
//9876673
//37689
public class H09提取不重复的整数 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  ArrayList<Character> list=new ArrayList<>();
	  while(sc.hasNext()) {
		  String s=sc.nextLine();
		  for(int i=s.length()-1;i>0;i--)
		  {   char c=s.charAt(i);
			  if(!list.contains(c)) {//查看list是否包含c
				  list.add(c);
			  }
		  }
		  
		  Iterator<Character> it=list.iterator();
		  while(it.hasNext()) {
			  System.out.print(it.next());
		  }
	  }
}
}

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ArrayList<Character> list=new ArrayList<>();
while(sc.hasNext()) {
String s=sc.nextLine();
char [] chars=s.toCharArray();
for(int i=chars.length-1;i>=0;i--) {
	if(!list.contains(chars[i])) {
		list.add(chars[i]);
	}
}

for(char c:list) {
	System.out.print(c);
}
		
}
}
*/
