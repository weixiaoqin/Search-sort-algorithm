package ��ָoffer;
//����n���������ҳ�������С��K������
//��������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
//����1��ð�����򣻷���2����������
/*���ڶ������㷨���������ѡ�ʱ�临�Ӷ�ΪO(nlogk)
 * �����ѱ�����k������ÿ��ֻ�ͶѶ��ȣ�����ȶѶ�С��ɾ���Ѷ���������ѡ�

*����ÿ�������ʱ�临�Ӷ�ΪO(nlogn)��
*�����ð������ʱ�临�Ӷ�ΪO(n*k)
**/
public class N032��С��K���� {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] a, int k) {
        ArrayList<Integer> list=new ArrayList<>();
    	if(k<=0||k>a.length||a.length==0) {
        	return list;
        }
    	for(int i=0;i<k;i++) {
    		int min=a[i];
    		for(int j=i+1;j<a.length;j++) {//������ð��������С������������ǰ��
    			if(min>a[j]) {
                   int temp=a[j];
                    a[j]=min;
                    min=temp;
    				//min=a[j];����ֱ��ȡֵ��Ҫ������������Ȼ��С�������ں���
    			}
    		}
    		list.add(min);
    	}
       return list;
    }
}
