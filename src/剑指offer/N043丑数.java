package 剑指offer;
//题目描述
//把只包含质因子2、3和5的数称作丑数（Ugly Number）。
//例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。
//求按从小到大的顺序的第N个丑数。
public class N043丑数 {
	public int GetUglyNumber_Solution(int index) {
		if(index<=0) return 0;
		int m=0;//用于计算第几个丑数
		int n=0;
		while(m<index) {
			n++;
			if(isugly(n)) {
				m++;
			}
		}
        return n;
    }
	
	public boolean isugly(int n) {
		while(n%2==0) n=n/2;
		while(n%3==0) n=n/3;
		while(n%5==0) n=n/5;
		if(n==1) {
			return true;
		}
		else return false;
	}
}
