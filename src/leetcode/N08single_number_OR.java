package leetcode;
//��Ŀ����
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
        	num=num^a[i];//������㣬����ż���ε�������������³��������ε���
        	//������ͬ����������򣬽��Ϊ0
        }
        return num;
    }
}
