package 查找排序算法;
//算法描述：对于一组给定的记录，通过一趟排序后，将原序列分为两部分，其中前一部分的所有记录均比后一部分的所有记录小，
//然后再依次对前后两部分的记录进行快速排序，递归该过程，直到序列中的所有记录均有序为止。
//平均O(nlogn),最好O(nlogn),最坏O(n^2);空间复杂度O(nlogn);不稳定;较复杂
public class N07快速排序 {
	public static void main(String[] args) {
		int arr[]=new int[]{70,55,75,1,8};
		 int[] ar = {1,1,2,0,9,175,162,599,3,12,7,8,13,4,65,22,23,-8,-6};
		//quickSort(arr,0,arr.length-1);
		quickSort(ar,0,ar.length-1);
		for(int i:ar) {
			System.out.println(i);
			// System.out.println(i+",");//用println打印出的数有问题
			 // System.out.print(i+",");
		}
	}
	
public static int partition(int[] a,int low,int high) {// 首先是进行一轮快速排序的函数：
	int key=a[low];//选取基准点
	while(low<high){
		while(low<high&&a[high]>=key) high--;
//		
//		if(a[high]<key) {
//			int temp=a[high];
//			a[high]=key;//a[high]和key 交换
//			key=temp;
//		}
		
		if(a[high]<key) {
			int temp=a[high];
			a[high]=a[low];//a[high]和a[low] 交换
			a[low]=temp;
		}
	
		while(low<high&&a[low]<=key)low++;
//		if(a[low]>key) {
//			int temp=a[low];
//			a[low]=key;//a[low]和key 交换
//			key=a[low];
//		}
		if(a[low]>key) {
			int temp=a[high];
			a[high]=a[low];//a[high]和a[low] 交换
			a[low]=temp;
		}
	}
	return low;
}

public static void quickSort(int[] a,int low,int high){//要定义方法类型
	if(low>=high) return;
	if(low<high) {
		int index=partition(a, low, high);// //进行第一轮排序获取分割点
		quickSort(a,low,index-1);////排序前半部
		quickSort(a,index+1,high);////排序后半部分
	}
}

}
