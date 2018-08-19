package 剑指offer;
//常常需要计算连续子向量的最大和,当向量全为正数的时候,问题很好解决。
//但是,如果向量中包含负数,是否应该包含某个负数,并期望旁边的正数会弥补它呢？
//例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
//给一个数组，返回它的最大连续子序列的和，你会不会被他忽悠住？(子向量的长度至少是1)

/*使用动态规划
F（i）：以array[i]为末尾元素的子数组的和的最大值，子数组的元素的相对位置不变
F（i）=max（F（i-1）+array[i] ， array[i]）
res：所有子数组的和的最大值
res=max（res，F（i））
*/
public class N033连续子数组的最大和 {
	public  int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
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
