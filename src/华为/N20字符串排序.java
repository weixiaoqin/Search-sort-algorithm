package ��Ϊ;

import java.util.Scanner;

//��Ŀ����
//��дһ�����򣬽������ַ����е��ַ������¹�������
//
//���� 1 ��Ӣ����ĸ�� A �� Z ���У������ִ�Сд��
//
//       �磬���룺 Type   ����� epTy
//
//���� 2 ��ͬһ��Ӣ����ĸ�Ĵ�Сдͬʱ����ʱ����������˳�����С�
//
//     �磬���룺 BabA   ����� aABb
//
//���� 3 ����Ӣ����ĸ�������ַ�����ԭ����λ�á�
//
//     �磬���룺 By?e   ����� Be?y
//
//������
//
//    ���룺
//
//   A Famous Saying: Much Ado About Nothing(2012/8).
//
//    �����
//
//   A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).
//
//
//��������:
//
//
//�������:
//
//
//ʾ��1
//����
//����
//A Famous Saying: Much Ado About Nothing (2012/8).
//���
//����
//A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
public class N20�ַ������� {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		System.out.println(sortstring(s));
	}
}
 
  public static String sortstring(String s) {
	  StringBuilder sb=new StringBuilder();
	  for(int i=0;i<26;i++) {
		  for(int j=0;j<s.length();j++) {
			char  c=s.charAt(j);
			  if(c=='A'+i||c=='a'+i)
				  sb.append(c);
		  }
	  }
	  for(int k=0;k<s.length();k++) {
		  char ch=s.charAt(k);
		  if(!(ch>'a'&&ch<'z')&&!(ch>'A'&&ch<'Z'))
			  sb.insert(k, ch);
	  }
	  return sb.toString();
  }
}
