package 剑指offer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//题目描述
//输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
//例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
public class N042把数组排成最小的数 {
	 public String PrintMinNumber(int [] numbers) {
	        if(numbers==null || numbers.length==0) return "";
	        int length = numbers.length;
	        String[] str = new String[length];
	        for(int i=0;i<length;i++) {
	            str[i] = String.valueOf(numbers[i]);
	        }
	        Arrays.sort(str, new Comparator<String>() {
	            @Override
	            public int compare(String o1, String o2) {
	                String c2 = o1+o2;
	                String c3 = o2+o1;
	                return c2.compareTo(c3);
	            }
	        });
	        StringBuilder sb = new StringBuilder();
	        for(int i=0;i<length;i++) {
	            sb.append(str[i]);
	        }
	        return sb.toString();
	    }
}
