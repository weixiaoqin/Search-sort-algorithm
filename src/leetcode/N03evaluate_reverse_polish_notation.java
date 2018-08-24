package leetcode;
//evaluate-reverse-polish-notation
//�����沨�����ʽ���ֽк�׺���ʽ����ֵ��
//Evaluate the value of an arithmetic expression in Reverse Polish Notation.

import java.util.Stack;

//Valid operators are+,-,*,/. Each operand may be an integer or another expression.

//Some examples:

//  ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
//  ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
//[]��һ��ջ�洢������������������ֱ��ѹ��ջ�ڣ������������Ͱ�ջ���������������ó�������һ�£�Ȼ�������������ջ�ڡ�
public class N03evaluate_reverse_polish_notation {
    public int evalRPN(String[] s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length;i++) {
        	String cur=s[i];
        	if(isOperator(s[i])==false) {
        		st.push(Integer.valueOf(s[i]));//���ǲ��������������ѹ��st
        	}
        	else {//������ǲ�����
        		int b=st.pop();
        		int a=st.pop();
        		st.push(result(a,b,s[i]));//���㺯��result(a,b,s[i])
        		
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
    	return 0;//Ҫ�ǵüӷ���ֵ
    }
}
