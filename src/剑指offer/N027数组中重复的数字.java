package ��ָoffer;

import java.util.HashMap;

//��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�Ҳ��֪��ÿ�������ظ�����
//���ҳ�����������һ���ظ������֡� ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
public class N027�������ظ������� {
	 public boolean duplicate(int numbers[],int length,int [] duplication) {
		 if(length<=0) return false;
		 HashMap<Integer, Integer> map=new HashMap<>();//���ù�ϣ���������ʹ���
		 for(int i=0;i<numbers.length;i++) {
			 if(map.containsKey(numbers[i])) {//�������ĳ����
				 int t=map.get(numbers[i]);//ȡ��ֵ
				 t++;
				 map.put(numbers[i], t);
			 }
			 else map.put(numbers[i], 1);
		 }
		 
		 for(int i=0;i<numbers.length;i++) {
			 if(map.get(numbers[i])>=2) {//�������ڵ���2
				 duplication[0]=numbers[i];
				 return true;
//				 break;
			 }
		 }
		 return false;
		 
	 }
}
