package ��ָoffer;
//һֻ����һ�ο�������1��̨�ף�Ҳ��������2��������Ҳ��������n����
//�����������һ��n����̨���ܹ��ж�����������
//Yano_nankai
/*��Ϊn��̨�ף���һ����n����������1������2��������n��
��1����ʣ��n-1������ʣ��������f(n-1)
��2����ʣ��n-2������ʣ��������f(n-2)\
...��n-1����ʣ��1������ʣ��������1
����f(n)=f(n-1)+f(n-2)+...+f(1)+1
��Ϊf(n-1)=f(n-2)+f(n-3)+...+f(1)+1
����f(n)=2*f(n-1)
*/
//ok ���ɷ�
/*public class N13��̬��̨�� {
    public int JumpFloorII(int target)  {
    	if(target<=0) {
    		return 0;
    	}
    	else if(target==1) {
    		return 1;
    	}
    	else {
    		return 2*JumpFloorII(target-1);
    	}
    }
}
*/
public class N13��̬��̨�� {
    public int JumpFloorII(int target)  {
    	if(target<=0) {
    		return 0;
    	}
    	else if(target==1) {
    		return 1;
    	}
    	else {
    		return 2*JumpFloorII(target-1);//���ܵ�����3��if��䣬Ҫ���elseʹ��
    	}
    }
}