package ���������㷨;
//���������ǵ��۰���ң������иĽ��ռ�ġ��۰����mid�Ĺ�ʽ��������΢��ʽ�任��õ�: 
//mid = (low+high)/2 = low + (high-low)/2
//Ҳ����mid��������±�low��������±�high��low�Ĳ��һ�롣�㷨��ѧ���ǿ��ǵľ��ǽ���� 1/2 ���иĽ���ͨ����ȣ��Ľ�Ϊ����ļ��㷽��: 
//mid = low + ((key - a[low])/(a[high] - a[low]))*(high - low)
//�����Ϳ��Դ����߲��ҵ�Ч�ʡ�
//��ֵ����(Interpolation Search)�Ǹ���Ҫ���ҵĹؼ��� key ����ұ��������С��¼�Ĺؼ��ֱȽϺ�Ĳ��ҷ�����
//����ľ����ڲ�ֵ�ļ��㹫ʽ(key - a[low])/(a[high] - a[low])��Ӧ��˵����ʱ�临�Ӷ���������Ҳ��O(logn)��
//�����ڱ��ϴ󣬶��ؼ��ֲַ��ֱȽϾ��ȵĲ��ұ���˵����ֵ�����㷨��ƽ�����ܱ��۰����Ҫ�õö� ��
public class N06��ֵ����_�۰���ҵĸĽ� {
	public static void main(String[] args) {
		int ar[]=new int[]{70,85,95,106,188};
		// int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		int i=insertSearch(ar,155);
		//for(int i:ar) {
			System.out.println(i);
			// System.out.println(i+",");//��println��ӡ������������
			 // System.out.print(i+",");
		//}
	}
	public static int insertSearch(int[] a, int key) {
		int low, mid, high;
		low = 0;// ��С�±�
		high = a.length - 1;// ���С��
		while (low < high) {
			mid = low + (high - low) * (key - a[low]) / (a[high] - a[low]);
			// mid = (high + low) / 2;// �۰��±�
			if (key > a[mid]) {
				low = mid + 1; // �ؼ��ֱ� �۰�ֵ ������С�±� ���� �۰��±����һλ
			} else if (key < a[mid]) {
				high = mid - 1;// �ؼ��ֱ� �۰�ֵ С��������±� ���� �۰��±��ǰһλ
			} else {
				return mid; // �� key == a[mid] ���� �۰��±�
			}
		}
		return -1;
	}
}
