package ��Ϊ;
//����һ��������㹤�ߣ� A��ʾ�����ƶ���D��ʾ�����ƶ���W��ʾ�����ƶ���S��ʾ�����ƶ����ӣ�0,0���㿪ʼ�ƶ����������ַ��������ȡһЩ���꣬�����������������������ļ����档
//���룺
//�Ϸ�����ΪA(����D����W����S) + ���֣���λ����
//����֮����;�ָ���
//�Ƿ��������Ҫ���ж�������AA10;  A1A;  $%$;  YAD; �ȡ�
//
//������һ���򵥵����� �磺
//A10;S20;W10;D30;X;A1A;B10A11;;A10;
//
//
//������̣�
//
//��㣨0,0��
//
//
//+   A10   =  ��-10,0��
//
//+   S20   =  (-10,-20)
//
//+   W10  =  (-10,-10)
//
//+   D30  =  (20,-10)
//
//+   x    =  ��Ч
//
//+   A1A   =  ��Ч
//+   B10A11   =  ��Ч
//+  һ���� ��Ӱ��
//+   A10  =  (10,-10)

import java.util.Scanner;

//��� ��10�� -10��
public class H15�����ƶ� {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		String s1 []=s.split(";");
		result(s1);
	}
}
  
  public static void result(String s1 []) {
	  int x=0;
	  int y=0;
	  for(int i=0;i<s1.length;i++) {
		  int temp=0;
		  char ch []=s1[i].toCharArray();//���ַ���ת�����ַ�����
		  for(int j=1;j<ch.length;j++) {//j�ӵڶ����ַ���ʼ
			  if(ch[j]>='0'&&ch[j]<='9') {
				  temp=temp*10+ch[j]-'0';//�����ƶ�����ֵ
			  }
			  else{
				  temp=0;//
				  break; 
			  }
			  
		  }
		  
		  if(ch[0]=='A') {//�жϵ�һ���ַ���ֵ������Ӧ�ļ���
			  x-=temp;
		  }
		  else if(ch[0]=='D') {
			  x+=temp;
		  }
		  else if(ch[0]=='W') {
			  y+=temp;
		  }
		  else if(ch[0]=='S') {
			  y-=temp;
		  }
		  
	  }
	  
	  System.out.println("("+x+","+y+")");
  }
  
}
