package ��Ϊ;
//��Ŀ����
//���ݱ��¼��������������ֵ����Ա�������ͬ�ļ�¼���кϲ���������ͬ��������ֵ����������㣬�������keyֵ������������
//
//��������:
//�������ֵ�Եĸ���
//Ȼ������ɶԵ�index��valueֵ���Կո����
//
//�������:
//����ϲ���ļ�ֵ�ԣ����У�
//4
//0 1
//0 2
//1 2
//3 4

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

//0 3
//1 2
//3 4
public class H08�ϲ����¼ {
	   public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			TreeMap<Integer, Integer> map=new TreeMap<>();
			while(sc.hasNext()) {
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {//ѭ����ȡkey ��val
					int k=sc.nextInt();
					int v=sc.nextInt();
					if(map.containsKey(k)) {
						int temp=map.get(k);
						map.put(k, v+temp);
					}
					else {
						map.put(k, v);
					}
				}
			}
			 Set<Integer> set=map.keySet();//key�ļ���
			Iterator<Integer> it=set.iterator();
			while(it.hasNext()) {
				int key=it.next();
				System.out.println(key+" "+map.get(key));
			}
		}
}
