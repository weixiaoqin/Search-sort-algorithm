package ��Ϊ;

import java.util.Scanner;

//��Ŀ����
//1����������ַ������мӽ��ܣ��������
//
//2���ܷ���Ϊ��
//
//��������Ӣ����ĸʱ���ø�Ӣ����ĸ�ĺ�һ����ĸ�滻��ͬʱ��ĸ�任��Сд,����ĸaʱ���滻ΪB����ĸZʱ���滻Ϊa��
//
//������������ʱ��Ѹ����ּ�1����0�滻1��1�滻2��9�滻0��
//
//�����ַ������仯��
//
//3�����ܷ���Ϊ���ܵ�����̡�
//
//�ӿ�������
//
//    ʵ�ֽӿڣ�ÿ���ӿ�ʵ��1������������
//
//void Encrypt (char aucPassword[], char aucResult[])���ڸú�����ʵ���ַ������ܲ����
//
//˵����
//
//1���ַ�����\0��β��
//
//2���ַ����100���ַ���
//
//int unEncrypt (char result[], char password[])���ڸú�����ʵ���ַ������ܲ����
//
//˵����
//
//1���ַ�����\0��β��
//
//2���ַ����100���ַ���
//
//
//��������:
//����˵��
//����һ��Ҫ���ܵ�����
//����һ���ӹ��ܵ�����
//
//�������:
//���˵��
//������ܺ���ַ�
//������ܺ���ַ�
//
//ʾ��1
//����
//����
//abcdefg
//BCDEFGH
//���
//����
//BCDEFGH
//abcdefg
public class H22�ַ������� {
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
			char t=(char)(c-'a'+'A'+1);//Ҫ�ǵ�ת����char
			sb.append(t);
		}
		else if(c=='z') sb.append('A');
		else if(c>='0'&&c<='8') sb.append((char)(c+1));//Ҫ�ǵ�ת����char(char)(c+1),������������֣��Ǵ��
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
