package ��ָoffer;
//��1+2+3+...+n��Ҫ����ʹ�ó˳�����for��while��if��else��switch��case�ȹؼ��ּ������ж���䣨A?B:C����
//����˼·��
//1.�������߼���Ķ�·����ʵ�ֵݹ���ֹ�� 
//2.��n==0ʱ��(n>0)&&((sum+=Sum_Solution(n-1))>0)ִֻ��ǰ����жϣ�Ϊfalse��Ȼ��ֱ�ӷ���0��
3.��n>0ʱ��ִ��sum+=Sum_Solution(n-1)��ʵ�ֵݹ����Sum_Solution(n)��
public class N029��1��n������֮�� {
  public int Sum_Solution(int n) {
        int sum=n;
        boolean a=(n>0)&&((sum+=Sum_Solution(n-1)))>0;//��Ҫ���Ǻ���ġ�0,java�ķ�0������Ĭ��Ϊtrue
        return sum;
	
    }
}
