package ��ָoffer;
//������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
//˼·��
//ջA�����������
//ջB���������У���ջBΪ��ʱ��ջAȫ����ջ��ջB,ջB�ٳ�ջ���������У�
public class N17������ջʵ�ֶ��� {
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
