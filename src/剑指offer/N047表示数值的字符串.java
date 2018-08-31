package 剑指offer;
//题目描述
//请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
//例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
//但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
public class N047表示数值的字符串 {
	 public boolean isNumeric(char[] str) {
		 String s=String.valueOf(str);//把字符数组转换成字符串
		 String match="[+-]?[0-9]*(\\.[0-9]*)?([Ee][+-]?[0-9]+)?";//正则表达式
		 return s.matches(match);
		 //?表示出现0次或一次；
		 //*表示出现0次或多次；
		 //+表示出现一次或多次
		// return s.matches(match);
	 }
}
