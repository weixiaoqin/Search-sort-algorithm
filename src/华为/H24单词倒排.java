package ��Ϊ;

import java.util.Scanner;

//��Ŀ����
//���ַ����е����е��ʽ��е��š�
//
//˵����
//
//1��ÿ����������26����д��СдӢ����ĸ���ɣ�
//
//2���ǹ��ɵ��ʵ��ַ�����Ϊ���ʼ������
//
//3��Ҫ���ź�ĵ��ʼ������һ���ո��ʾ�����ԭ�ַ��������ڵ��ʼ��ж�������ʱ������ת����Ҳֻ�������һ���ո�������
//
//4��ÿ�������20����ĸ��
//
//��������:
//����һ���Կո����ָ��ľ���
//
//�������:
//������ӵ�����
//
//ʾ��1
//����
//����
//I am a student
//���
//����
//student a am I
public class H24���ʵ��� {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
	    s=s.replaceAll("[^a-zA-Z]+", " ").trim();//�Ѷ������ĸ���ַ��滻��1�ո񣬣�ȥ����β���ո�
		String ss []=s.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=ss.length-1;i>0;i--) {
			sb.append(ss[i]);
			sb.append(" ");
		}
		sb.append(ss[0]);
		System.out.println(sb.toString());
	}
}
}
