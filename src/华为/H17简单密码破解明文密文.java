package ��Ϊ;

import java.util.Scanner;

//��Ŀ����
//���������������зǳ���Ҫ�Ķ��������ǵ���ôһ�㲻��˵�����ܾ�ȫ�����ˡ��۹���. ������Ԩ��Ҫ������֮���ټ�һ�����룬��Ȼ�򵥵�Ҳ��ȫ��
//
//����Ԩ��ԭ��һ��BBS�ϵ�����Ϊzvbo9441987,Ϊ�˷�����䣬��ͨ��һ���㷨���������任��YUANzhi1987��
//����������������ֺͳ�����ݣ���ô���������ˣ����ҿ�����Ŀ�ŵ��ط������۵ĵط�����������֪�����������롣
//
//������ô�任�ģ���Ҷ�֪���ֻ��ϵ���ĸ�� 1--1�� abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
//����ô�򵥣�Ԩ�Ӱ������г��ֵ�Сд��ĸ����ɶ�Ӧ�����֣����ֺ������ķ��Ŷ������任��
//
//������������û�пո񣬶������г��ֵĴ�д��ĸ����Сд֮��������һλ���磺X���ȱ��Сд����������һλ��������y����򵥰ɡ���ס��z��������aŶ��
//
//��������:
//�����������������ݡ�������һ�����ģ����볤�Ȳ�����100���ַ�������ֱ���ļ���β
//
//�������:
//���Ԩ������������
//YUANzhi1987
//zvbo9441987
public class H17�������ƽ��������� {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		
		String s=sc.nextLine();
		StringBuilder sb=new StringBuilder("");
		char [] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char h=change(ch[i]);
			sb.append(h);
	//		sb.append(change(ch[i]));
		}
		sb.toString();
		System.out.println(sb);
	}
}
 
 public static char change(char c) {
	 char h;
	 if(c>='a'&&c<='c') {
		 h='2';
	 }
	 else if(c>='d'&&c<='f') {
		 h='3';
	 }
	 else if(c>='g'&&c<='i') {
		 h='4';
	 }
	 else if(c>='j'&&c<='l') {
		 h='5';
	 }
	 else if(c>='m'&&c<='o') {//ע��O����
		 h='6';
	 }
	 else if(c>='p'&&c<='s') {
		 h='7';
	 }
	 else if(c>='t'&&c<='v') {
		 h='8';
	 }
	 else if(c>='w'&&c<='z') {
		 h='9';
	 }
	 else if(c>='A'&&c<='Y') {
		 h=(char)(Character.toLowerCase(c)+1);//ת����Сд�������ƶ�һλ
	 }//Ҫ��(char)ǿ��ת��������cannot convert from int to char
	 else if(c=='Z') {
		 h='a';
	 }
	 else h=c;
	 return h;
 }
}
