package 华为;
//开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
//输入：
//合法坐标为A(或者D或者W或者S) + 数字（两位以内
//坐标之间以;分隔。
//非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
//
//下面是一个简单的例子 如：
//A10;S20;W10;D30;X;A1A;B10A11;;A10;
//
//
//处理过程：
//
//起点（0,0）
//
//
//+   A10   =  （-10,0）
//
//+   S20   =  (-10,-20)
//
//+   W10  =  (-10,-10)
//
//+   D30  =  (20,-10)
//
//+   x    =  无效
//
//+   A1A   =  无效
//+   B10A11   =  无效
//+  一个空 不影响
//+   A10  =  (10,-10)

import java.util.Scanner;

//结果 （10， -10）
public class H15坐标移动 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		String s1 []=s.split(";");
		result(s1);
	}
}
  
  public static void result(String s1 []) {
	  int x=0;
	  int y=0;
	  for(int i=0;i<s1.length;i++) {
		  int temp=0;
		  char ch []=s1[i].toCharArray();//把字符串转换成字符数组
		  for(int j=1;j<ch.length;j++) {//j从第二个字符开始
			  if(ch[j]>='0'&&ch[j]<='9') {
				  temp=temp*10+ch[j]-'0';//计算移动的数值
			  }
			  else{
				  temp=0;//
				  break; 
			  }
			  
		  }
		  
		  if(ch[0]=='A') {//判断第一个字符的值，做相应的计算
			  x-=temp;
		  }
		  else if(ch[0]=='D') {
			  x+=temp;
		  }
		  else if(ch[0]=='W') {
			  y+=temp;
		  }
		  else if(ch[0]=='S') {
			  y-=temp;
		  }
		  
	  }
	  
	  System.out.println("("+x+","+y+")");
  }
  
}
