package leetcode;
//There are N children standing in a line. Each child is assigned a rating value.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//What is the minimum candies you must give?       
//题意：N个孩子站成一排，每个孩子分配一个分值。给这些孩子派发糖果，满足如下要求：
//每个孩子至少一个
//分值更高的孩子比他的相邻位的孩子获得更多的糖果
//求至少分发多少糖果？
public class N09candy {
  public int candy(int a[]) {
	  int sum=1;
	  int temp=1;
	  for(int i=1;i<a.length;i++) {
		  if(a[i]>a[i-1]) {
			  temp+=1;
			  sum=sum+temp;
		  }
		  else if(a[i]==a[i-1]){
			  temp=temp;
			  sum+=temp;
		  }
		  else if(a[i]<a[i-1]&&temp==1) {
			  temp=1;
			  sum+=temp;
		  }
		  else if(a[i]<a[i-1]&&temp>=1)
	  }
  }
}
