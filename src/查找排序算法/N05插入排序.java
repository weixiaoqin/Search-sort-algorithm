package ���������㷨;
//��1������˼�룺ÿ����һ��������ļ�¼������˳�����С���뵽ǰ���Ѿ�����������еĺ���λ�ã��Ӻ���ǰ�ҵ�����λ�ú󣩣�ֱ��ȫ������������Ϊֹ��
//���Ӷ�O��n*n��/
/*��������,�ȶ���
 * 
 1�ӵ�һ��Ԫ�ؿ�ʼ����Ԫ�ؿ�����Ϊ�Ѿ�������
 2 ȡ����һ��Ԫ�أ����Ѿ������Ԫ�������дӺ���ǰɨ�� 
 3 �����Ԫ�أ������򣩴�����Ԫ�أ�����Ԫ���Ƶ���һλ��  
 * �ظ�����3��ֱ���ҵ��������Ԫ��С�ڻ��ߵ�����Ԫ�ص�λ��  
 * ����Ԫ�ز��뵽��λ����  
 * �ظ�����2  */
public class N05�������� {
	public static void main(String[] args) {
		int ar[]=new int[]{70,55,75,1,8};
		 int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		insertsort(ar);
		for(int i:ar) {
			//System.out.println(i);
			// System.out.println(i+",");//��println��ӡ������������
			 System.out.print(i+",");
		}
	}
 public static  void insertsort(int [] a) {
	 
	 int n=a.length;
	 int temp;
	 int j=0;
	 for(int i=0;i<n;i++) {
		 temp=a[i];
		 for(j=i;j>0&&temp<a[j-1];j--) { //����temp��ǰ���ֵС����ǰ���ֵ����
			 a[j]=a[j-1];
		 }
		 a[j]=temp;//j--
	 }
 }
}

/*public void Isort(int[] number) {
    int n = number.length;
    int temp;
    for(int i = 1; i< n; i++) {
        for(int j = i; j>0 && number[j-1] > number[j]; j--) {
            temp = number[j];
            number[j] = number[j-1];
            number[j-1] = temp;
        }
    }
}
��ʵ�������������ѭ���У�temp��������ֵΪҪ��ֵ������x[i]�ĳ�ʼֵ�����������ǲ���Ҫ��ʱ���˷ѣ�
�������ǽ�����������temp�ĸ�ֵ����Ƴ���ѭ�����޸ıȽ���䣬�õ��Ż����㷨��*/
