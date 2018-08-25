package leetcode;
//题目描述
//
//Given an array of integers, every element appears twice except for one. Find that single one.
//
//Note: 
//Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
//


public class N08single_number_OR {
    public int singleNumber(int[] a) {
        int num=a[0];
        for(int i=1;i<a.length;i++) {
        	num=num^a[i];//异或运算，出现偶数次的数相抵消，留下出现奇数次的数
        	//两个相同的数进行异或，结果为0
        }
        return num;
    }
}
