package ��ָoffer;
//������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý����
//����,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�
//����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
//��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(�������ĳ���������1)

/*ʹ�ö�̬�滮
F��i������array[i]ΪĩβԪ�ص�������ĺ͵����ֵ���������Ԫ�ص����λ�ò���
F��i��=max��F��i-1��+array[i] �� array[i]��
res������������ĺ͵����ֵ
res=max��res��F��i����
*/
public class N033��������������� {
	public  int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0]; //��¼��ǰ����������ĺ͵����ֵ
        int max=array[0];   //����array[i]�������������ֵ
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
	}

}
/*
 * public int FindGreatestSumOfSubArray(int[] array)
    {
        if(array.length==0)return 0;
        int sum=array[0];
        int maxsum=array[0];
        for(int i=1;i<array.length;i++)
        {
            if(sum<0)sum=0;
            sum+=array[i];
            maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
    }
*/
