package ���������;
//��������������ʹ��ջ��������������ȳ�

import java.util.ArrayList;
import java.util.Stack;

/*public class N01��ʮ������ת����������� {
  public ArrayList<Integer> change(int num,int n){// 0<n<9
	  ArrayList<Integer> list=new ArrayList<>();
	  Stack<Integer> st=new Stack<>();
	  if(num==0||n==0) return 0;
	  while(num!=0) {
		  st.add(num%n);//�����ǵ�λ
		  num=num/n;    //������ε�λ����
	  }
	  list.add(st.pop());
	 return list; 
  }
}
*/
public class N01��ʮ������ת����������� {
	  public ArrayList<Character> change(int num,int n){// n=16
		  ArrayList<Character> list=new ArrayList<>();
		  Stack<Character> st=new Stack<>();
		  if(num==0) return 0;
		  while(num!=0) {
			  int t=num%16;
			  if(t>=0&&t<=9)
			  st.add('t');//�����ǵ�λ
			  else st.add('A'+t-10);
			  num=num/n;    //������ε�λ����
		  }
		  list.add(st.pop());
		 return list; 
	  }
	}