package 查找排序算法;
//从表的一端开始，顺序扫描表，依次将扫描到的结点关键字和给定值（假定为a）相比较，若当前结点关键字与a相等，则查找成功；
//若扫描结束后，仍未找到关键字等于a的结点，则查找失败。

//适用于线性表的顺序存储结构和链式存储结构。
//平均查找长度=（n+1）/2

public class N01顺序查找 {
	public static void main(String[] args) {
		/*public int seqSearch(int a[],int key) {//遍历查找，每次还得判断i是否越界
			  for(int i=0;i<a.length;i++) {
				  if(a[i]==key) {
					  return i;
				  }
			  }
			  return -1;
		  }
		  */
		public int seqSearch(int a[],int key) {//设置哨兵的方法，不用每次循环都判断i是否越界
			a[0]=key;
			int i=a.length;
			while(a[i]!=key) {
				i--;
			}
			  return i;
		  }

	}
}
