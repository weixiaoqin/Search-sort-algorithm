package ��Ϊ;

import java.util.Scanner;

//��һ��Ӣ������Ե���Ϊ��λ�����ŷš����硰I am a boy���������ŷź�Ϊ��boy a am I��
//���е���֮����һ���ո����������г���Ӣ����ĸ�⣬���ٰ��������ַ�
public class H12�������� {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
}
  public String reverse(String sentence) {
	  String s []=sentence.split(" ");
	  StringBuilder sb=new StringBuilder();
	  for(int i=s.length-1;i>0;i--) {
		  sb.append(s[i]+" ");
	  }
	  sb.append(s[0]);
	  return sb.toString();
  }
}
