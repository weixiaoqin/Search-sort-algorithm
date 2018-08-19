package 剑指offer;
//输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
//例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
//则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

import java.util.ArrayList;

public class N20顺时针打印矩阵 {
  public ArrayList<Integer> printMatrix(int a[][]){
	  int n=a.length;
	  int m=a[0].length;
	   ArrayList<Integer> list=new ArrayList<>();
	   
	   int layers=n/2+n%2;
	   for(i=0;i<layers;i++) {//遍历的层数
		   for(int j=i;j<m-i;j++) {//从左到最右a[0][0]-a[0][m]
			   list.add(a[i][j]);
		   }
		   for(int k=i+1;k<n-1-i;k++) {//从上到最下
			   list.add(a[k][m-i]);
		   }
		   for(int j=m-2-i;j>=i;j--) {//从右下，到最左下
			   list.add(a[n-1-i][k]);
		   }
		   for(int k=n-2-i;k<=i+1;k++) {//从下到上
			   list.add(a[k][i]);
		   }
	   }
	   return list;
	   
	  
  }
}
