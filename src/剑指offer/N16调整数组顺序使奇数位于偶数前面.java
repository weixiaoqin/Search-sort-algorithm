package ��ָoffer;

import java.util.ArrayList;

//����һ���������飬ʵ��һ�����������������������ֵ�˳��
//ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
//����֤������������ż����ż��֮������λ�ò��䡣
public class N16��������˳��ʹ����λ��ż��ǰ�� {
	 public void reOrderArray(int [] array) {
	        ArrayList<Integer> one=new ArrayList<>();
	        ArrayList<Integer> two=new ArrayList<>();
	        int n=array.length ;
	        for(int i=0;i<n;i++){//��������ֱ��������ż��
	        	int t=array[i];
	        	if(t%2==1) {
	        		one.add(t);
	        	}
	        	else if(t%2==0) {
	        		two.add(t);
	        	}
	        }
	        int m=0;
	        for(int i=0;i<one.size();i++) {
	        	array[m]=one.get(i);
	        	m++;
	        }
	        for(int j=0;j<two.size();j++) {
	        	array[m]=two.get(j);
	            m++;
	        }
}
}

/*������ð������ǰ����ż�����������������򽻻�
public class Solution {
    public void reOrderArray(int [] array) {
       for(int i= 0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j]=array[j+1];
                    array[j+1]=t;
                }
            }
        }
    }
}
