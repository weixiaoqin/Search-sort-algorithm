package ��ָoffer;

//��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��,
//���û���򷵻� -1����Ҫ���ִ�Сд��.

//��key value�ķ�������һ��ɨ���ַ�����key�洢�ַ���value�洢���ַ����ֵ�����
//�ڶ��Σ�ɨ���ַ������жϹ�ϣ���и��ַ��������Ƿ�Ϊ1��
public class N036��һ��ֻ����һ�ε��ַ� {
	public int FirstNotRepeatingChar(String str)
    {
    HashMap<Character, Integer> map=new HashMap<>();
    for(int i=0;i<str.length();i++) {
    	char c=str.charAt(i);
    		if(map.containsKey(c)) {
    			int t=map.get(c);
    			t++;
    			map.put(c, t);//�����ۼ�
    		}
    		else map.put(c, 1);//֮ǰû�д洢���ַ�
   	}
    
    for(int i=0;i<str.length();i++) {
    	if(map.get(str.charAt(i))==1)
    		return i;
    }
    return -1;
   }
   
 }

    
