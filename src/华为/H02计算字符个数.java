package ��Ϊ;

import java.util.Scanner;

//д��һ�����򣬽���һ������ĸ��������ɵ��ַ�������һ���ַ���Ȼ����������ַ����к��и��ַ��ĸ����������ִ�Сд��
//����һ������ĸ�������Լ��ո���ɵ��ַ�������һ���ַ���
//
//�������:
//��������ַ����к��и��ַ��ĸ�����
//����
//ABCDEF A
//���
//1
public class H02�����ַ����� {
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
