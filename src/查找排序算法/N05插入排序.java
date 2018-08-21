package 查找排序算法;
//　1、基本思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置（从后向前找到合适位置后），直到全部插入排序完为止。
//复杂度O（n*n）/
/*插入排序,稳定的
 * 
 1从第一个元素开始，该元素可以认为已经被排序
 2 取出下一个元素，在已经排序的元素序列中从后向前扫描 
 3 如果该元素（已排序）大于新元素，将该元素移到下一位置  
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置  
 * 将新元素插入到该位置中  
 * 重复步骤2  */
public class N05插入排序 {
	public static void main(String[] args) {
		int ar[]=new int[]{70,55,75,1,8};
		 int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		insertsort(ar);
		for(int i:ar) {
			//System.out.println(i);
			// System.out.println(i+",");//用println打印出的数有问题
			 System.out.print(i+",");
		}
	}
 public static  void insertsort(int [] a) {
	 
	 int n=a.length;
	 int temp;
	 int j=0;
	 for(int i=0;i<n;i++) {
		 temp=a[i];
		 for(j=i;j>0&&temp<a[j-1];j--) { //假如temp比前面的值小，则将前面的值后移
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
其实在上述代码的内循环中，temp被反复赋值为要插值的数（x[i]的初始值），所以这是不必要的时间浪费，
于是我们将上面两个含temp的赋值语句移出内循环，修改比较语句，得到优化的算法：*/
