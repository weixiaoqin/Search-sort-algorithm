package 查找排序算法;
//时间复杂度为O(nlog2n)。每一趟归并的时间复杂度为O(n)，共需要进行⌈log2n⌉趟。对应的算法的
//归并排序的空间复杂度O(n)。另外，归并排序中归并的算法并不会将相同关键字的元素改变相对次序，所以归并排序是稳定的。
import java.util.Arrays;
public class N08归并排序 {
    public static void main(String []args) {
        int a[] = {3, 6, 1, 7, 9, 4, 5, 8, 2};
        int b[]=new int[a.length];;
        mergeSort(a,b,0,a.length-1);
        System.out.println("排序后：" + Arrays.toString(a));
        for(int i:a) {
        	System.out.print(i+",");
        }
    }

//    private static void mergeSort(int[] arr) {
//        mergeSort(arr, new int[arr.length], 0, arr.length - 1);
//    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid); // 左边
            mergeSort(arr, temp, mid + 1, right); // 右边
            merge(arr, temp, left, mid + 1, right); // 合并两个有序
        }
    }

   /* /**
     * 将两个有序表归并成一个有序表
     *
     * @param arr
     * @param temp     临时数组
     * @param leftPos  左边开始下标
     * @param rightPos 右边开始下标
     * @param rightEnd 右边结束下标
     */
    private static void merge(int[] arr, int[] temp, int leftPos, int rightPos, int rightEnd) {
        int leftEnd = rightPos - 1; // 左边结束下标
        int tempPos = leftPos; // 从左边开始算
        int numEle = rightEnd - leftPos + 1; // 元素个数
        while (leftPos <= leftEnd && rightPos <= rightEnd) {
            if (arr[leftPos] <= arr[rightPos])
                temp[tempPos++] = arr[leftPos++];
            else
                temp[tempPos++] = arr[rightPos++];
        }
        while (leftPos <= leftEnd) {  // 左边如果有剩余
            temp[tempPos++] = arr[leftPos++];
        }
        while (rightPos <= rightEnd) { // 右边如果有剩余
            temp[tempPos++] = arr[rightPos++];
        }
        // 将temp复制到arr
        for (int i = 0; i < numEle; i++) {
            arr[rightEnd] = temp[rightEnd];
            rightEnd--;
        }
    }


}
