package 华为;

import java.util.Scanner;

//写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
//\输入描述:
//	输入一个正浮点数值5.5
//
//	输出描述:
//	输出该数值的近似整数值 6
public class H07取近似值 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			float n=sc.nextFloat();
			System.out.println(getnum(n));
		}
	}
   public static int getnum(float n) {
//	   (n-(int)n)<=0.5?(int)n:(int)n+1;
	   return  (n-(int)n)<0.5?(int)n:1+(int)n;
   }
}
