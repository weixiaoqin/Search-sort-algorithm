package 剑指offer;

import java.util.Queue;

import javax.management.Query;

//题目描述
//汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
//对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
//例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
public class N040左旋转字符串 {
    public String LeftRotateString(String str,int n) {
///        Queue<Character> s=new Query();
    	if(str.length()==0) return "";//要先判断空字符串的情况
        StringBuilder s=new StringBuilder("");
        s.append(str.substring(n));//截取第n个之后的字符
        s.append(str.substring(0,n));//截取前面的n个字符
        return s.toString();
        
    }
}
