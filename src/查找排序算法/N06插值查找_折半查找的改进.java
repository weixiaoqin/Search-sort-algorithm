package 查找排序算法;
//看来，我们的折半查找，还是有改进空间的。折半计算mid的公式，我们略微等式变换后得到: 
//mid = (low+high)/2 = low + (high-low)/2
//也就是mid等于最低下标low加上最高下标high与low的差的一半。算法科学家们考虑的就是将这个 1/2 进行改进，通过类比，改进为下面的计算方案: 
//mid = low + ((key - a[low])/(a[high] - a[low]))*(high - low)
//这样就可以大大提高查找的效率。
//插值查找(Interpolation Search)是根据要查找的关键字 key 与查找表中最大最小记录的关键字比较后的查找方法，
//其核心就在于插值的计算公式(key - a[low])/(a[high] - a[low])。应该说，从时间复杂度来看，它也是O(logn)，
//但对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好得多 。
public class N06插值查找_折半查找的改进 {
	public static void main(String[] args) {
		int ar[]=new int[]{70,85,95,106,188};
		// int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};
		int i=insertSearch(ar,155);
		//for(int i:ar) {
			System.out.println(i);
			// System.out.println(i+",");//用println打印出的数有问题
			 // System.out.print(i+",");
		//}
	}
	public static int insertSearch(int[] a, int key) {
		int low, mid, high;
		low = 0;// 最小下标
		high = a.length - 1;// 最大小标
		while (low < high) {
			mid = low + (high - low) * (key - a[low]) / (a[high] - a[low]);
			// mid = (high + low) / 2;// 折半下标
			if (key > a[mid]) {
				low = mid + 1; // 关键字比 折半值 大，则最小下标 调成 折半下标的下一位
			} else if (key < a[mid]) {
				high = mid - 1;// 关键字比 折半值 小，则最大下标 调成 折半下标的前一位
			} else {
				return mid; // 当 key == a[mid] 返回 折半下标
			}
		}
		return -1;
	}
}
