package ��ָoffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
//��Ŀ����
//����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
//������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
public class N042�������ų���С���� {
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
