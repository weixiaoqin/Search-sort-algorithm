package ��ָoffer;

//һ�����������������������֮�⣬���������ֶ�������ż���Ρ���д�����ҳ�������ֻ����һ�ε����֡�

//��һ��ɨ�������ù�ϣ�������ֳ��ֵĴ������ڶ���ɨ�������ҳ����ִ���Ϊ1��
import java.util.HashMap;

public class N037������ֻ����һ�ε����� {
	 public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
	 HashMap<Integer, Integer> map=new HashMap<>();
	    for(int i=0;i<array.length;i++) {
	    	int n=array[i];
	    		if(map.containsKey(n)) {
	    			int t=map.get(n);
	    			t++;
	    			map.put(n, t);//�����ۼ�
	    		}
	    		else map.put(n, 1);//֮ǰû�д洢���ַ�
	   	}
	    int flag=1;
	    for(int i=0;i<array.length;i++) {
	    	if(map.get(array[i])==1&&flag==1) {
	    		num1[0]=array[i];
	    		flag=0;
	    	}
	    	else if(map.get(array[i])==1&&flag==0) {//ע�⣺Ҫ�ӣ�else if�����ܵ�����if��������˳��ִ�У��������ȷnum1[0]==num2[0]
	    		num2[0]=array[i];
	    		break;
	    	}
	    		
	    }
	    
	 }
}
