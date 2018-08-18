package 剑指offer;
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
//思路：
//栈A用来作入队列
//栈B用来出队列，当栈B为空时，栈A全部出栈到栈B,栈B再出栈（即出队列）
public class N17用两个栈实现队列 {
	 Stack<Integer> st1=new Stack<Integer>();
	 Stack<Integer> st2=new Stack<Integer>();
	 
	 public void push(int a) {
			 st1.push(a);
	 }
	 
	 public int pop() {
		if(st1.empty()&&st2.empty()) {
			throw new RuntimeException("empty");
		}
		
		if(st2.empty()) {
			while(!st1.empty()) {
				st2.push(st1.pop());
			}
		}
			return st2.pop();
	 }
}
