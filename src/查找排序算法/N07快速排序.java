package ���������㷨;
//�㷨����������һ������ļ�¼��ͨ��һ������󣬽�ԭ���з�Ϊ�����֣�����ǰһ���ֵ����м�¼���Ⱥ�һ���ֵ����м�¼С��
//Ȼ�������ζ�ǰ�������ֵļ�¼���п������򣬵ݹ�ù��̣�ֱ�������е����м�¼������Ϊֹ��
//ƽ��O(nlogn),���O(nlogn),�O(n^2);�ռ临�Ӷ�O(nlogn);���ȶ�;�ϸ���
public class N07�������� {
	public static void main(String[] args) {
		int arr[]=new int[]{70,55,75,1,8};
		 int[] ar = {1,1,2,0,9,175,162,599,3,12,7,8,13,4,65,22,23,-8,-6};
		//quickSort(arr,0,arr.length-1);
		quickSort(ar,0,ar.length-1);
		for(int i:ar) {
			System.out.println(i);
			// System.out.println(i+",");//��println��ӡ������������
			 // System.out.print(i+",");
		}
	}
	
public static int partition(int[] a,int low,int high) {// �����ǽ���һ�ֿ�������ĺ�����
	int key=a[low];//ѡȡ��׼��
	while(low<high){
		while(low<high&&a[high]>=key) high--;
//		
//		if(a[high]<key) {
//			int temp=a[high];
//			a[high]=key;//a[high]��key ����
//			key=temp;
//		}
		
		if(a[high]<key) {
			int temp=a[high];
			a[high]=a[low];//a[high]��a[low] ����
			a[low]=temp;
		}
	
		while(low<high&&a[low]<=key)low++;
//		if(a[low]>key) {
//			int temp=a[low];
//			a[low]=key;//a[low]��key ����
//			key=a[low];
//		}
		if(a[low]>key) {
			int temp=a[high];
			a[high]=a[low];//a[high]��a[low] ����
			a[low]=temp;
		}
	}
	return low;
}

public static void quickSort(int[] a,int low,int high){//Ҫ���巽������
	if(low>=high) return;
	if(low<high) {
		int index=partition(a, low, high);// //���е�һ�������ȡ�ָ��
		quickSort(a,low,index-1);////����ǰ�벿
		quickSort(a,index+1,high);////�����벿��
	}
}

}
