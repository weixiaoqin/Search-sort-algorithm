package ��Ϊ;
//��Ŀ����
//����n���ַ��������n���ַ��������ֵ������С�
//��������:
//�����һ��Ϊһ��������n(1��n��1000),����n��Ϊn���ַ���(�ַ������ȡ�100),�ַ�����ֻ���д�Сд��ĸ��
//�������:
//�������n�У�������Ϊ�����ֵ������е��ַ�����
//9
//cap
//to
//cat
//card
//two
//too
//up
//boat
//boot

import java.util.ArrayList;
import java.util.Scanner;

//boat
//boot
//cap
//card
//cat
//to
//too
//two
//up
public class N13�ַ������� {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	ArrayList<String> list=new ArrayList<>();
	while(sc.hasNext()) {
//		int n=sc.nextInt();//�������ȡ����������ʾԽ�磬��������֪��Ϊʲô
		int n=Integer.parseInt(sc.nextLine());//�����û������
		while(n!=0&&sc.hasNextLine()) {
			list.add(sc.nextLine());
			n--;
		}
		list.sort(null);//null����ʡ��
		for(String s:list) {
			System.out.println(s);
		}
	}
	
}
}
