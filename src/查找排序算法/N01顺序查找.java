package ���������㷨;
//�ӱ��һ�˿�ʼ��˳��ɨ������ν�ɨ�赽�Ľ��ؼ��ֺ͸���ֵ���ٶ�Ϊa����Ƚϣ�����ǰ���ؼ�����a��ȣ�����ҳɹ���
//��ɨ���������δ�ҵ��ؼ��ֵ���a�Ľ�㣬�����ʧ�ܡ�

//���������Ա��˳��洢�ṹ����ʽ�洢�ṹ��
//ƽ�����ҳ���=��n+1��/2

public class N01˳����� {
	public static void main(String[] args) {
		/*public int seqSearch(int a[],int key) {//�������ң�ÿ�λ����ж�i�Ƿ�Խ��
			  for(int i=0;i<a.length;i++) {
				  if(a[i]==key) {
					  return i;
				  }
			  }
			  return -1;
		  }
		  */
		public int seqSearch(int a[],int key) {//�����ڱ��ķ���������ÿ��ѭ�����ж�i�Ƿ�Խ��
			a[0]=key;
			int i=a.length;
			while(a[i]!=key) {
				i--;
			}
			  return i;
		  }

	}
}
