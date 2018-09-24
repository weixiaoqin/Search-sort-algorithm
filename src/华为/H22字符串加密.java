package 华为;

import java.util.Scanner;

//题目描述
//1、对输入的字符串进行加解密，并输出。
//
//2加密方法为：
//
//当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
//
//当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
//
//其他字符不做变化。
//
//3、解密方法为加密的逆过程。
//
//接口描述：
//
//    实现接口，每个接口实现1个基本操作：
//
//void Encrypt (char aucPassword[], char aucResult[])：在该函数中实现字符串加密并输出
//
//说明：
//
//1、字符串以\0结尾。
//
//2、字符串最长100个字符。
//
//int unEncrypt (char result[], char password[])：在该函数中实现字符串解密并输出
//
//说明：
//
//1、字符串以\0结尾。
//
//2、字符串最长100个字符。
//
//
//输入描述:
//输入说明
//输入一串要加密的密码
//输入一串加过密的密码
//
//输出描述:
//输出说明
//输出加密后的字符
//输出解密后的字符
//
//示例1
//输入
//复制
//abcdefg
//BCDEFGH
//输出
//复制
//BCDEFGH
//abcdefg
public class H22字符串加密 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println(jiami(s1));
		System.out.println(jiemi(s2));
	}
}
public static String jiami(String s) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='A'&&c<='Y') {
			char t=(char)(c-'A'+'a'+1);
			sb.append(t);
		}
		else if(c=='Z') sb.append('a');
		else if(c>='a'&&c<='y') {
			char t=(char)(c-'a'+'A'+1);//要记得转换成char
			sb.append(t);
		}
		else if(c=='z') sb.append('A');
		else if(c>='0'&&c<='8') sb.append((char)(c+1));//要记得转换成char(char)(c+1),否则输出是数字，是错的
		else if(c=='9') sb.append('0');
		else sb.append(c);
	}
	
	return sb.toString();
}

public static String jiemi(String s) {
	StringBuilder sb=new StringBuilder();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c>='b'&&c<='z') {
			char t=(char)(c-'a'+'A'-1);
			sb.append(t);
		}
		else if(c=='a') sb.append('Z');
		else if(c>='B'&&c<='Z') {
			char t=(char)(c-'A'+'a'-1);
			sb.append(t);
		}
		else if(c=='A') sb.append('z');
		else if(c>='1'&&c<='9') sb.append((char)(c-1));
		else if(c=='0') sb.append('9');
		else sb.append(c);
	}
	
	return sb.toString();
}
}
