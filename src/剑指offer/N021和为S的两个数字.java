package ��ָoffer;
//����һ����������������һ������S���������в�����������ʹ�����ǵĺ�������S��
//����ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
//��Ӧÿ�����԰����������������С���������

import java.lang.reflect.Array;
import java.util.ArrayList;
//[���û������������]
////��ʼ���ھ���˻���С������ת��һ�룬a+b=sum,a��bԽԶ�˻�ԽС����һͷһβ����ָ�����ڿ����ķ����ҵ��ľ��ǳ˻���С�������
//����ǳ˻������������һֱ�ҵ�����ָ���غϣ�ÿ���ҵ�һ���ͽ�֮ǰ���صĽ���������Ȼ�����Ϊ���ҵ��ġ�[����ջ������ȳ�]
public class N021��ΪS���������� {
	  public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
	        ArrayList<Integer> list=new ArrayList<>();
	        if(array.length<2) {
	        	return list;
	        }
	        int low=0;
	        int high=array.length-1;
	        while(low<high) {
	        	if(array[low]+array[high]==sum) {
	        		list.add(array[low]);
	        		list.add(array[high]);
	        		break;
	        	}
	        	else if(array[low]+array[high]>sum) {
	        		high--;
	        	}
	        	else low++;
	        }
	        
	        return list;
	    }
}
