package ��Ϊ;

import java.util.Scanner;

//д��һ�����򣬽���һ����������ֵ���������ֵ�Ľ�������ֵ�����С�������ֵ���ڵ���5,����ȡ����С��5��������ȡ����
//\��������:
//	����һ����������ֵ5.5
//
//	�������:
//	�������ֵ�Ľ�������ֵ 6
public class H07ȡ����ֵ {
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
