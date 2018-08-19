package 其他编程题;
//除数求余数法，使用栈来存余数，后进先出

import java.util.ArrayList;
import java.util.Stack;

/*public class N01把十进制数转换成任意进制 {
  public ArrayList<Integer> change(int num,int n){// 0<n<9
	  ArrayList<Integer> list=new ArrayList<>();
	  Stack<Integer> st=new Stack<>();
	  if(num==0||n==0) return 0;
	  while(num!=0) {
		  st.add(num%n);//余数是低位
		  num=num/n;    //整除求次低位的数
	  }
	  list.add(st.pop());
	 return list; 
  }
}
*/
public class N01把十进制数转换成任意进制 {
	  public ArrayList<Character> change(int num,int n){// n=16
		  ArrayList<Character> list=new ArrayList<>();
		  Stack<Character> st=new Stack<>();
		  if(num==0) return 0;
		  while(num!=0) {
			  int t=num%16;
			  if(t>=0&&t<=9)
			  st.add('t');//余数是低位
			  else st.add('A'+t-10);
			  num=num/n;    //整除求次低位的数
		  }
		  list.add(st.pop());
		 return list; 
	  }
	}