package 华为;

import java.util.Scanner;

//计算字符串最后一个单词的长度，单词以空格隔开。
//输入描述:
//一行字符串，非空，长度小于5000。
//
//输出描述:
//整数N，最后一个单词的长度。
//输入
//
//hello world
//
//复制
//5
public class H01字符串最后一个单词的长度 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		int n=s.length()-1-s.lastIndexOf(' ');
		System.out.println(n);
	}
}
}
