package ��ָoffer;
//��Ŀ����
//��ֻ����������2��3��5��������������Ugly Number����
//����6��8���ǳ�������14���ǣ���Ϊ������������7�� ϰ�������ǰ�1�����ǵ�һ��������
//�󰴴�С�����˳��ĵ�N��������
public class N043���� {
	public int GetUglyNumber_Solution(int index) {
		if(index<=0) return 0;
		int m=0;//���ڼ���ڼ�������
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
