package ��ָoffer;
//��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
//�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
public class N8��ά�����еĲ��� {
	 public boolean Find(int target, int [][] array) {

	      int i=array.length-1;//�����½ǿ�ʼ����
		   int j=0;
		    while(i>=0&&j<=array[i].length-1) {//ѭ������
		    	 if(array[i][j]==target) {
					   return true;
				   }
		    	 else if(array[i][j]>target) {
					   i--;
				   } 
		    	 else j++;
	        }     
	        return false;
	    }
}
