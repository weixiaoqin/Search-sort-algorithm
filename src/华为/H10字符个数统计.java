package ��Ϊ;

import java.util.ArrayList;
import java.util.Scanner;

//��Ŀ����
//��дһ�������������ַ����к��еĲ�ͬ�ַ��ĸ������ַ���ACSII�뷶Χ��(0~127)�����ڷ�Χ�ڵĲ���ͳ�ơ�
//
//��������:abc
//����N���ַ����ַ���ACSII�뷶Χ�ڡ�
//
//�������:3
//�����Χ��(0~127)�ַ��ĸ�����
public class H10�ַ�����ͳ�� {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    ArrayList<Character> list=new ArrayList<>();
    while(sc.hasNext()) {
    	String s=sc.nextLine();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(!list.contains(c)) {
    			list.add(c);
    		}
    	}
    	System.out.println(list.size());
    	}
    }
}
