package 华为;

import java.util.Scanner;

//写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
//输入一个有字母和数字以及空格组成的字符串，和一个字符。
//
//输出描述:
//输出输入字符串中含有该字符的个数。
//输入
//ABCDEF A
//输出
//1
public class H02计算字符个数 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()){
		
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char c=s2.charAt(0);
		int sum=0;
		for(int i=0;i<s1.length()-1;i++) {
			if(s1.toLowerCase().charAt(i)==c) sum++;
		}
		System.out.println(sum);
	}
	
 }
}
