package ��Ϊ;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//��Ŀ����
//����һ��int�����������մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�������
//
//��������:
//����һ��int������
//
//�������:
//���մ���������Ķ�˳�򣬷���һ�������ظ����ֵ��µ�����
//9876673
//37689
public class H09��ȡ���ظ������� {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  ArrayList<Character> list=new ArrayList<>();
	  while(sc.hasNext()) {
		  String s=sc.nextLine();
		  for(int i=s.length()-1;i>0;i--)
		  {   char c=s.charAt(i);
			  if(!list.contains(c)) {//�鿴list�Ƿ����c
				  list.add(c);
			  }
		  }
		  
		  Iterator<Character> it=list.iterator();
		  while(it.hasNext()) {
			  System.out.print(it.next());
		  }
	  }
}
}

/*	public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
ArrayList<Character> list=new ArrayList<>();
while(sc.hasNext()) {
String s=sc.nextLine();
char [] chars=s.toCharArray();
for(int i=chars.length-1;i>=0;i--) {
	if(!list.contains(chars[i])) {
		list.add(chars[i]);
	}
}

for(char c:list) {
	System.out.print(c);
}
		
}
}
*/
