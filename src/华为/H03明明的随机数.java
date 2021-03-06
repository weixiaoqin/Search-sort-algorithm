package 华为;
//明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，
//他先用计算机生成了N个1到1000之间的随机整数（N≤1000），
//对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应着不同的学生的学号。
//然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成“去重”与“排序”的工作(同一个测试用例里可能会有多组数据，希望大家能正确处理)。
//Input Param
//n          输入随机数的个数
//
//inputArray    n个随机整数组成的数组

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

//OutputArray    输出处理后的随机整数
public class H03明明的随机数 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		TreeSet<Integer> t=new TreeSet<>();//TreeSet元素不重复，且是排序的
		for(int i=n;i>0;i--) {
			t.add(sc.nextInt());
		}
		Iterator<Integer> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
}
