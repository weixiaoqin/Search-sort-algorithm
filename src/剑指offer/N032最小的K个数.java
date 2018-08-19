package 剑指offer;
//输入n个整数，找出其中最小的K个数。
//例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
//方法1：冒泡排序；方法2：构造最大堆
/*基于堆排序算法，构建最大堆。时间复杂度为O(nlogk)
 * 用最大堆保存这k个数，每次只和堆顶比，如果比堆顶小，删除堆顶，新数入堆。

*如果用快速排序，时间复杂度为O(nlogn)；
*如果用冒泡排序，时间复杂度为O(n*k)
**/
public class N032最小的K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] a, int k) {
        ArrayList<Integer> list=new ArrayList<>();
    	if(k<=0||k>a.length||a.length==0) {
        	return list;
        }
    	for(int i=0;i<k;i++) {
    		int min=a[i];
    		for(int j=i+1;j<a.length;j++) {//类似于冒泡排序；最小的数交换到最前面
    			if(min>a[j]) {
                   int temp=a[j];
                    a[j]=min;
                    min=temp;
    				//min=a[j];不能直接取值，要做交换；；不然最小的数还在后面
    			}
    		}
    		list.add(min);
    	}
       return list;
    }
}
