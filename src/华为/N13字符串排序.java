package 华为;
//题目描述
//给定n个字符串，请对n个字符串按照字典序排列。
//输入描述:
//输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
//输出描述:
//数据输出n行，输出结果为按照字典序排列的字符串。
//9
//cap
//to
//cat
//card
//two
//too
//up
//boat
//boot

import java.util.ArrayList;
import java.util.Scanner;

//boat
//boot
//cap
//card
//cat
//to
//too
//two
//up
public class N13字符串排序 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	ArrayList<String> list=new ArrayList<>();
	while(sc.hasNext()) {
//		int n=sc.nextInt();//用这个读取整数老是提示越界，出错，，不知道为什么
		int n=Integer.parseInt(sc.nextLine());//用这个没有问题
		while(n!=0&&sc.hasNextLine()) {
			list.add(sc.nextLine());
			n--;
		}
		list.sort(null);//null不能省略
		for(String s:list) {
			System.out.println(s);
		}
	}
	
}
}
