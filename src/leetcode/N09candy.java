package leetcode;
//There are N children standing in a line. Each child is assigned a rating value.
//
//You are giving candies to these children subjected to the following requirements:
//
//Each child must have at least one candy.
//Children with a higher rating get more candies than their neighbors.
//What is the minimum candies you must give?       
//���⣺N������վ��һ�ţ�ÿ�����ӷ���һ����ֵ������Щ�����ɷ��ǹ�����������Ҫ��
//ÿ����������һ��
//��ֵ���ߵĺ��ӱ���������λ�ĺ��ӻ�ø�����ǹ�
//�����ٷַ������ǹ���
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
