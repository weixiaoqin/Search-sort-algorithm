package ��ָoffer;
//ͳ��һ�����������������г��ֵĴ�����
//����һ��ѭ������
//����2�����ַ����ҵ�����һ��K�����һ��K��λ�ã�
public class N23���������������г��ֵĴ��� {
  public int getNumOfK(int a[],int k) {
	  String s=a.
	  if(a.length ==0) return 0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
			} 
			if(a[i]>k) break;//����k�ͽ���ѭ��
		}
		return count;
  }
}
