package 华为;
//功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）

import java.util.Scanner;

//最后一个数后面也要有空格
//180
//2 2 3 3 5
//
//输入描述:
//输入一个long型整数
//
//输出描述:
//按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
public class H06质数因子 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			long n=sc.nextLong();
			String s=getResult(n);
			System.out.println(s);
		}
	}
	public static String getResult(long n) {
		String s="";
		int pum=2;
		while(n!=1)
		{
			while(n%pum==0) 
			{//循环除以质数因子
				n=n/pum;
				s=s+pum+" ";//字符串连接
			}
			
			pum++;//寻找下一个质数因子
		  }
		return s;
	}
}
