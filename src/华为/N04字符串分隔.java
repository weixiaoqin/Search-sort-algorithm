package 华为;

import java.util.Scanner;

//•连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
//•长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。 
//输入描述:
//连续输入字符串(输入2次,每个字符串长度小于100)
//
//输出描述:
//输出到长度为8的新字符串数组
//abc
//123456789
//
//abc00000
//12345678
//90000000

public class N04字符串分隔 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		while(s.length()>=8) {//如果字符串的长度大于8，就截取前8个字符打印出来
			String s1=s.substring(0, 8);
			System.out.println(s1);
			s=s.substring(8);
		}
		if(s.length()>0&&s.length()<8) {
			s=s+"00000000";
		    System.out.println(s.substring(0, 8));
		}
	}
}
}
