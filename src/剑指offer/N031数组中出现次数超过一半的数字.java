package ��ָoffer;

import java.util.HashMap;

//��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
//��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}����������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
//HashMap��key value�ֱ�洢 ֵ�ʹ���
public class N031�����г��ִ�������һ������� {
   public int solution(int [] a) {
	   if(a.length==0) {
		   return 0;
	   }
	   HashMap<Integer, Integer> map=new HashMap<>();
	   for(int i=0;i<a.length;i++) {
		   if(map.containsKey(a[i])) {
			   int n=map.get(a[i])+1;
			   map.put(a[i], n);
		   }
		   else {
			   map.put(a[i], 1);
		   }
		   if(map.get(a[i])>a.length/2) {
			   return a[i];
		   }
	   }
	   return 0;
   }
}
