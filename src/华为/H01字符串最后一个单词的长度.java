package ��Ϊ;

import java.util.Scanner;

//�����ַ������һ�����ʵĳ��ȣ������Կո������
//��������:
//һ���ַ������ǿգ�����С��5000��
//
//�������:
//����N�����һ�����ʵĳ��ȡ�
//����
//
//hello world
//
//����
//5
public class H01�ַ������һ�����ʵĳ��� {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		int n=s.length()-1-s.lastIndexOf(' ');
		System.out.println(n);
	}
}
}
