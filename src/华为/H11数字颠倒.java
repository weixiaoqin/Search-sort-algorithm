package 华为;
//题目描述
//描述：
//
//输入一个整数，将这个整数以字符串的形式逆序输出
//
//程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
//
// 
//
//输入描述:
//输入一个int整数
//
//输出描述:
//将这个整数以字符串的形式逆序输出
public class H11数字颠倒 {
	 public static void main(String [] args){
	        Scanner in=new Scanner(System.in);
	        
	        while(in.hasNextLine()){
	            String s=in.nextLine();
//	            char [] chars=s.toCharArray();
//	            for(int i=s.length()-1;i>=0;i--){
//	                System.out.print(s.charAt(i));
//	            }
	            for(int i=s.length()-1;i>=0;i--) {
	            	char c=s.charAt(i);
	            	System.out.print(c);
	            }
	        }
	    }
}


//import java.util.*;
//public class Main{
//    public static void main(String [] args){//字符串反转
//        Scanner in=new Scanner(System.in);
//        
//        while(in.hasNextLine()){
//            String s=in.nextLine();
//            for(int i=s.length()-1;i>=0;i--){
//                System.out.print(s.charAt(i));
//            }
//        }
//    }
//}