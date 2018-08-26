package 华为;

import java.util.ArrayList;
import java.util.Scanner;

//题目描述
//编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
//
//输入描述:abc
//输入N个字符，字符在ACSII码范围内。
//
//输出描述:3
//输出范围在(0~127)字符的个数。
public class H10字符个数统计 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    ArrayList<Character> list=new ArrayList<>();
    while(sc.hasNext()) {
    	String s=sc.nextLine();
    	for(int i=0;i<s.length();i++) {
    		char c=s.charAt(i);
    		if(!list.contains(c)) {
    			list.add(c);
    		}
    	}
    	System.out.println(list.size());
    	}
    }
}
