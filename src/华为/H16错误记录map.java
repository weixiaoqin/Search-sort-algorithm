package ��Ϊ;
//����һ���򵥴����¼����Сģ�飬�ܹ���¼����Ĵ������ڵ��ļ����ƺ��кš�
//���� 
//1�� ��¼���8�������¼��ѭ����¼������ͬ�Ĵ����¼�����ļ����ƺ��к���ȫƥ�䣩ֻ��¼һ��������������ӣ�
//2�� ����16���ַ����ļ����ƣ�ֻ��¼�ļ��������Ч16���ַ���
//3�� ������ļ����ܴ�·������¼�ļ����Ʋ��ܴ�·����
//��������:
//һ�л�����ַ�����ÿ�а�����·���ļ����ƣ��кţ��Կո������
//
//�������:
//�����еļ�¼ͳ�Ʋ�������������ʽ���ļ��� �������� ��Ŀ��һ���ո�������磺
//E:\V1R2\product\fpgadrive.c   1325
//fpgadrive.c 1325 1

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//��¼��������ʹ��Map������Ҫ�����ʹ��HashMap������������Ҫѭ�������
//�����ύһ�λ��в���������ʾ����Ҫ��������˳���������ʹ��LinkedHashMap
//�������ʱ����Ŀ����˼��ѭ���˸����������Ǳ����¼ȫ�����������
//����ռ�¼��󵯳��ˣ��������ͶԲ����ˣ�������ϵͳ���ȱҳ����ô�����ơ�
public class H16�����¼map {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Map<String, Integer> map=new LinkedHashMap<>();
	while(sc.hasNext()) {
		String s=sc.next();
		int line=sc.nextInt();
		
		String s1 []=s.split("\\\\");//����\�и�
		String file=s1[s1.length-1];
		
		 String file = error.substring(error.lastIndexOf("\\") + 1);
		if(file.length()>16) {
			file=file.substring(file.length()-16);//��ȡ
		}
		String key1=file+" "+line;
		if(map.containsKey(key1)) {
			map.put(key1, map.get(key1)+1);
		}
		else map.put(key1, 1);
	}
	
	int m=0;
	 for (String key:map.keySet()){
         m++;
         if(m > (map.size() -8))
             System.out.println(key + " " + map.get(key));
     }
}
}
