package ��Ϊ;
//��Ŀ����
//д��һ�����򣬽���һ��ʮ�����Ƶ���ֵ�ַ������������ֵ��ʮ�����ַ�����������ͬʱ���� ��
//
//��������:
//����һ��ʮ�����Ƶ���ֵ�ַ�����
//
//�������:
//�������ֵ��ʮ�����ַ�����

import java.util.Scanner;

//0xA
//10
public class H05����ת�� {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				String s1=s.substring(2);
				int sum=0;
				int temp=0;
				
				for(int i=0;i<s1.length();i++) {//�Ӻ�����ַ���ʼ����
					char ch=s.charAt(s1.length()-1-i);
//					int n=int(c);
					if(ch>='0'&&ch<='9') {
						temp=ch-'0';
					}
					else if(ch>='A'&&ch<='F') {
						temp=ch-'A'+10;
					}
					else if(ch>='a'&&ch<='f') {
						temp=ch-'a'+10;
					}
					sum=sum+(int)(temp*Math.pow(16, i));
					
				}
				System.out.println(sum);
			}
		}
}
