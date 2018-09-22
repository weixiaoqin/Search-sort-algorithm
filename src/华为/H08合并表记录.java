package 华为;
//题目描述
//数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
//
//输入描述:
//先输入键值对的个数
//然后输入成对的index和value值，以空格隔开
//
//输出描述:
//输出合并后的键值对（多行）
//4
//0 1
//0 2
//1 2
//3 4

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

//0 3
//1 2
//3 4
public class H08合并表记录 {
	   public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			TreeMap<Integer, Integer> map=new TreeMap<>();
			while(sc.hasNext()) {
				int n=sc.nextInt();
				for(int i=0;i<n;i++) {//循环读取key 和val
					int k=sc.nextInt();
					int v=sc.nextInt();
					if(map.containsKey(k)) {
						int temp=map.get(k);
						map.put(k, v+temp);
					}
					else {
						map.put(k, v);
					}
				}
			}
			 Set<Integer> set=map.keySet();//key的集合
			Iterator<Integer> it=set.iterator();
			while(it.hasNext()) {
				int key=it.next();
				System.out.println(key+" "+map.get(key));
			}
		}
}
