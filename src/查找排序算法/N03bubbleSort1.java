package 查找排序算法;
//冒泡排序O(n^2)稳定排序  设数组的长度为N： 
//（1）比较前后相邻的二个数据，如果前面数据大于后面的数据，就将这二个数据交换。
//冒泡排序就是把小的元素往前调或者把大的元素往后调。
//比较是相邻的两个元素比较，交换也发生在这两个元素之间。所以，如果两个元素相等，我想你是不会再无聊地把他们俩交换一下的；
//如果两个相等的元素没有相邻，那么即使通过前面的两两交换把两个相邻起来，这时候也不会交换，所以相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。
//（2）这样对数组的第0个数据到N-1个数据进行一次遍历后，最大的一个数据就“沉”到数组第N-1个位置。
public class N03bubbleSort1 {
	public static void main(String[] args) {
		
	    int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
       
	    N03bubbleSort1 st=new N03bubbleSort1();
	    bubbleSort1(arr, arr.length);//方法是static的可以直接调用，静态方法中不能调用非静态方法
	    
	    st.bubbleSort1(arr, arr.length);//如果方法不是static的，需要定义类对象，通过对象去调用非静态法
	    for(int i:arr){
	        System.out.print(i+",");
	    }
	}
 public static void  bubbleSort1(int [] a,int n) {
	 for(int i=1;i<n;i++) {//比较的轮数
		 for(int j=0;j<n-i;j++) {//每一轮，循环比较，大数沉底
			 if(a[j]>a[j+1]) {//如果前面的数大于后面的数，则两者交换
				 //swap(a[j],a[j+1]);//不能直接调用？
				 int tem=a[j];
				 a[j]=a[j+1];
				 a[j+1]=tem;
			 }
		 }
	 }
 }
 public static void swap(int a,int b) {
	 int temp=a;
	 a=b;
	 b=temp;
 }
 
}
