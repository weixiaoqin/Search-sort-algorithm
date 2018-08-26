package 华为;

import java.util.Scanner;

//将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
//所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
public class H12句子逆序 {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
}
  public String reverse(String sentence) {
	  String s []=sentence.split(" ");
	  StringBuilder sb=new StringBuilder();
	  for(int i=s.length-1;i>0;i--) {
		  sb.append(s[i]+" ");
	  }
	  sb.append(s[0]);
	  return sb.toString();
  }
}
