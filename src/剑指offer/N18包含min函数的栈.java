package ��ָoffer;
/*����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������*/
import java.util.Iterator;
import java.util.Stack;
public class N18����min������ջ {
	 Stack<Integer> st=new Stack<Integer>();
	   public void push(int n) {
		   st.push(n);
	   }
	   public void pop() {
		   st.pop();
	   }
	   
	   public int min() {
		   int min=st.peek();
		   Iterator<Integer> it=st.iterator();
		   while(it.hasNext()) {
			   int n=it.next();
			   if(min>n) {
				   min=n;
			   }
		   }
		   return min;
	   }
}
/*����2������ջmin,�������浱ǰջ����Сֵ��ֱ��return min.peek();
import java.util.Iterator;
import java.util.Stack;

public class Solution {
Stack<Integer> st=new Stack<Integer>();
	Stack<Integer> min=new Stack<Integer>();
	
	public void push(int a) {
		st.push(a);
		if(min.empty()) {
			min.push(a);
		}
		else {
			int m=min.peek();
			if(m>a) min.push(a);  //min ��a�Ƚ�
			else min.push(m);
		}
	}
	
	public void pop() {
		st.pop();
		min.pop();
	}
	public int top() {
		return st.peek();
	}
	 public int min() {
		 return min.peek();
	 }
}
*/