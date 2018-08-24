package leetcode;
//evaluate-reverse-polish-notation
//计算逆波兰表达式（又叫后缀表达式）的值。
//Evaluate the value of an arithmetic expression in Reverse Polish Notation.

import java.util.Stack;

//Valid operators are+,-,*,/. Each operand may be an integer or another expression.

//Some examples:

//  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
//[]用一个栈存储操作数，遇到操作数直接压入栈内，遇到操作符就把栈顶的两个操作数拿出来运算一下，然后把运算结果放入栈内。
public class N03evaluate_reverse_polish_notation {
    public int evalRPN(String[] s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length;i++) {
        	String cur=s[i];
        	if(isOperator(s[i])==false) {
        		st.push(Integer.valueOf(s[i]));//不是操作符，则把数据压入st
        	}
        	else {//如果不是操作符
        		int b=st.pop();
        		int a=st.pop();
        		st.push(result(a,b,s[i]));//计算函数result(a,b,s[i])
        		
        	}
        }
        return st.peek();
        
    }
    
    boolean isOperator(String s) {
    	if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")) {
    		return true;
    	}
    	else return false;
    }
    public int result(int a,int b,String str) {
    	if(str.equals("+")) return a+b;
    	if(str.equals("-")) return a-b;
    	if(str.equals("*")) return a*b;
    	if(str.equals("/")) return a/b;
    	return 0;//要记得加返回值
    }
}
