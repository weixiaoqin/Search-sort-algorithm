package 华为;
//开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
//处理： 
//1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
//2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
//3、 输入的文件可能带路径，记录文件名称不能带路径。
//输入描述:
//一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
//
//输出描述:
//将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
//E:\V1R2\product\fpgadrive.c   1325
//fpgadrive.c 1325 1

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//记录个数，故使用Map，不需要排序故使用HashMap，根据题意是要循环输出，
//而且提交一次会有测试用例提示，需要按照输入顺序输出，故使用LinkedHashMap
//在输出的时候，题目的意思是循环八个，但问题是必须记录全部错误个数，
//否则刚记录完后弹出了，错误数就对不上了，跟操作系统里的缺页有那么点相似。
public class H16错误记录map {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Map<String, Integer> map=new LinkedHashMap<>();
	while(sc.hasNext()) {
		String s=sc.next();
		int line=sc.nextInt();
		
		String s1 []=s.split("\\\\");//根据\切割
		String file=s1[s1.length-1];
		
		 String file = error.substring(error.lastIndexOf("\\") + 1);
		if(file.length()>16) {
			file=file.substring(file.length()-16);//截取
		}
		String key1=file+" "+line;
		if(map.containsKey(key1)) {
			map.put(key1, map.get(key1)+1);
		}
		else map.put(key1, 1);
	}
	
	int m=0;
	 for (String key:map.keySet()){
         m++;
         if(m > (map.size() -8))
             System.out.println(key + " " + map.get(key));
     }
}
}
