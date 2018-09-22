package 华为;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//题目描述
//实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。 
//输入描述:
//字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
//
//输出描述:
//删除字符串中出现次数最少的字符后的字符串。
//abcdd
//dd
public class H19删除字符串中出现次数最少的字符 {
	 public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()) {
				String s=sc.nextLine();
				char [] a=s.toCharArray();
				
				Map<Character, Integer> map=new LinkedHashMap<>();
				//LinkedHashMap 是HashMap的一个子类，保存了记录的插入顺序，
				//在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的
				int min=a.length;
				char chmin=a[0];
				for(int i=0;i<a.length;i++) {
					if(map.containsKey(a[i])) {
						map.put(a[i], map.get(a[i])+1);
					}
					else {
						map.put(a[i], 1);
					} 
					
					
				}
		        for(char a1:a){
		            if(map.get(a1)<min) {
						min=map.get(a1);
						chmin=a1;
					}
		        }
				StringBuilder sb=new StringBuilder("");
				for(int i=0;i<a.length;i++) {
//					if(a[i]!=chmin) {
//						sb.append(a[i]);
//					}
		              if(map.get(a[i])!=min)
		                sb.append(a[i]);
				}
				
				
				System.out.println(sb.toString());
			}
		}
}
