package ��Ϊ;
//��������ѧУ����һЩͬѧһ����һ���ʾ���飬Ϊ��ʵ��Ŀ͹��ԣ�
//�����ü����������N��1��1000֮������������N��1000����
//���������ظ������֣�ֻ����һ������������ͬ����ȥ������ͬ������Ӧ�Ų�ͬ��ѧ����ѧ�š�
//Ȼ���ٰ���Щ����С�������򣬰����źõ�˳��ȥ��ͬѧ�����顣����Э��������ɡ�ȥ�ء��롰���򡱵Ĺ���(ͬһ��������������ܻ��ж������ݣ�ϣ���������ȷ����)��
//Input Param
//n          ����������ĸ���
//
//inputArray    n�����������ɵ�����

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//OutputArray    ����������������
public class H03����������� {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		TreeSet<Integer> t=new TreeSet<>();//TreeSetԪ�ز��ظ������������
		for(int i=n;i>0;i--) {
			t.add(sc.nextInt());
		}
		Iterator<Integer> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
}
