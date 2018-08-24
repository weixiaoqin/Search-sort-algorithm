package 剑指offer;

import java.util.ArrayList;

//若可以改变数组，用快排，O(nlogn)
public class N035最小的k个数_快排方法 {
	 
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
	
		int ar[]=new int[]{70,55,75,1,8};
		 int[] a = {1,2,3,12,7,8,3,4,65,22};
		//quickSort(arr,0,arr.length-1);
		list1=GetLeastNumbers_Solution(ar,3);
	//	while(list1.)
//		for(int i=0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//			// System.out.println(i+",");//用println打印出的数有问题
//			 // System.out.print(i+",");
//		}
	}
	    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] a, int k) {
	        ArrayList<Integer> list=new ArrayList<>();
	    	if(k<=0||k>a.length||a.length==0) return list; 
	        	      	
	        	int end=a.length-1;
	        	int start=0;
	        	int mid=partition(a,0,a.length-1);
	        	while(mid!=k-1) {//如果中间值的位置bu等于k
	        		
	        		if(mid>k-1) {
	        			 end=mid-1;
	        			mid=partition(a,start,end);
	        		}
	        		if(mid<k-1) {
	        			  start=mid+1;
	        			mid=partition(a,start,end);
	        		}
	        	}
	        for(int i=0;i<k;i++) {
		    		list.add(a[i]);
		    		System.out.println(a[i]);
		    	}
	       return list;
	        
	    }
	
	    public static int partition(int [] a,int low,int high) {
    		int key=a[low];
            
    		while(low<high) {
    			while(low<high&&a[high]>=key) high--;
    			if(a[high]<key) {
    				int temp=a[high];
    				a[high]=key;
    				key=a[high];
    			}
    			while(low<high&&a[low]<=key) low++;
    			if(a[low]>key){
    				int temp=a[low];
    				a[low]=key;
    				key=a[low];
    			}
    		}
    		return low;
    	}

 }
	    

