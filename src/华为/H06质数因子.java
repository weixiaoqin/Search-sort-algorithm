package ��Ϊ;
//����:����һ�������������մ�С�����˳����������������������ӣ���180����������Ϊ2 2 3 3 5 ��

import java.util.Scanner;

//���һ��������ҲҪ�пո�
//180
//2 2 3 3 5
//
//��������:
//����һ��long������
//
//�������:
//���մ�С�����˳����������������������ӣ��Կո���������һ��������ҲҪ�пո�
public class H06�������� {
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
			{//ѭ��������������
				n=n/pum;
				s=s+pum+" ";//�ַ�������
			}
			
			pum++;//Ѱ����һ����������
		  }
		return s;
	}
}
