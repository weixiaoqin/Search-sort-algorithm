package 华为;

import java.util.Scanner;

//题目描述
//编写一个程序，将输入字符串中的字符按如下规则排序。
//
//规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
//
//       如，输入： Type   输出： epTy
//
//规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
//
//     如，输入： BabA   输出： aABb
//
//规则 3 ：非英文字母的其它字符保持原来的位置。
//
//     如，输入： By?e   输出： Be?y
//
//样例：
//
//    输入：
//
//   A Famous Saying: Much Ado About Nothing(2012/8).
//
//    输出：
//
//   A  aaAAbc   dFgghh :  iimM   nNn   oooos   Sttuuuy  (2012/8).
//
//
//输入描述:
//
//
//输出描述:
//
//
//示例1
//输入
//复制
//A Famous Saying: Much Ado About Nothing (2012/8).
//输出
//复制
//A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
public class N20字符串排序 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		System.out.println(sortstring(s));
	}
}
 
  public static String sortstring(String s) {
	  StringBuilder sb=new StringBuilder();
	  for(int i=0;i<26;i++) {
		  for(int j=0;j<s.length();j++) {
			char  c=s.charAt(j);
			  if(c=='A'+i||c=='a'+i)
				  sb.append(c);
		  }
	  }
	  for(int k=0;k<s.length();k++) {
		  char ch=s.charAt(k);
		  if(!(ch>'a'&&ch<'z')&&!(ch>'A'&&ch<'Z'))
			  sb.insert(k, ch);
	  }
	  return sb.toString();
  }
}
