package ��Ϊ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//��Ŀ����
//ʵ��ɾ���ַ����г��ִ������ٵ��ַ���������ַ����ִ���һ������ɾ�������ɾ����Щ���ʺ���ַ������ַ����������ַ�����ԭ����˳�� 
//��������:
//�ַ���ֻ����СдӢ����ĸ, �����ǷǷ����룬������ַ�������С�ڵ���20���ֽڡ�
//
//�������:
//ɾ���ַ����г��ִ������ٵ��ַ�����ַ�����
//abcdd
//dd
public class H19ɾ���ַ����г��ִ������ٵ��ַ� {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				char [] a=s.toCharArray();
				
				Map<Character, Integer> map=new LinkedHashMap<>();
				//LinkedHashMap ��HashMap��һ�����࣬�����˼�¼�Ĳ���˳��
				//����Iterator����LinkedHashMapʱ���ȵõ��ļ�¼�϶����Ȳ����
				int min=a.length;
				char chmin=a[0];
				for(int i=0;i<a.length;i++) {
					if(map.containsKey(a[i])) {
						map.put(a[i], map.get(a[i])+1);
					}
					else {
						map.put(a[i], 1);
					} 
					
					
				}
		        for(char a1:a){
		            if(map.get(a1)<min) {
						min=map.get(a1);
						chmin=a1;
					}
		        }
				StringBuilder sb=new StringBuilder("");
				for(int i=0;i<a.length;i++) {
//					if(a[i]!=chmin) {
//						sb.append(a[i]);
//					}
		              if(map.get(a[i])!=min)
		                sb.append(a[i]);
				}
				
				
				System.out.println(sb.toString());
			}
		}
}
