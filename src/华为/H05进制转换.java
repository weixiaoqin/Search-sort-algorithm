package 华为;
//题目描述
//写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
//
//输入描述:
//输入一个十六进制的数值字符串。
//
//输出描述:
//输出该数值的十进制字符串。

import java.util.Scanner;

//0xA
//10
public class H05进制转换 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				String s1=s.substring(2);
				int sum=0;
				int temp=0;
				
				for(int i=0;i<s1.length();i++) {//从后面的字符开始计算
					char ch=s.charAt(s1.length()-1-i);
//					int n=int(c);
					if(ch>='0'&&ch<='9') {
						temp=ch-'0';
					}
					else if(ch>='A'&&ch<='F') {
						temp=ch-'A'+10;
					}
					else if(ch>='a'&&ch<='f') {
						temp=ch-'a'+10;
					}
					sum=sum+(int)(temp*Math.pow(16, i));
					
				}
				System.out.println(sum);
			}
		}
}
