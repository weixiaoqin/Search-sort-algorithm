package 剑指offer;
/*定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。*/
import java.util.Iterator;
import java.util.Stack;
public class N18包含min函数的栈 {
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
/*方法2：辅助栈min,顶部保存当前栈的最小值，直接return min.peek();
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
			if(m>a) min.push(a);  //min 和a比较
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