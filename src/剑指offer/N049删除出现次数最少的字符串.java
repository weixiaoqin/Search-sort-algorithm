package ��ָoffer;
//���ӣ�https://www.nowcoder.com/questionTerminal/05182d328eb848dda7fdd5e029a56da9?orderByHotValue=1&page=6&onlyReference=false
//��Դ��ţ����
//
//ʵ��ɾ���ַ����г��ִ������ٵ��ַ���������ַ����ִ���һ������ɾ�������ɾ����Щ���ʺ���ַ������ַ����������ַ�����ԭ����˳�� 
//
//��������:
//�ַ���ֻ����СдӢ����ĸ, �����ǷǷ����룬������ַ�������С�ڵ���20���ֽڡ�
//
//
//
//�������:
//ɾ���ַ����г��ִ������ٵ��ַ�����ַ�����
//
//ʾ��1
//����
//abcdd
//���
//dd
import java.util.*;
public class N049ɾ�����ִ������ٵ��ַ��� {

		 public static void main(String[] args){
		        Scanner sc=new Scanner(System.in);
		        while(sc.hasNext()){
		             
		        String string=sc.nextLine();
		        char[] A=string.toCharArray();
		        Map<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		       
		         
		        for(char c:A){
		            if(!m.containsKey(c)){
		                 m.put(c,1);
		                 
		            }else{
		                m.put(c,m.get(c)+1);
		                
		            }     
		        }
		        Collection<Integer> al=m.values();
		        int index=Collections.min(al);
		      StringBuffer sb=new StringBuffer("");
		        for(char c:A){
		            if(m.get(c)!=index)
		                sb.append(c);
		        }
		             
		            System.out.print(sb.toString());
		             
		       }
		        
		    }
}
