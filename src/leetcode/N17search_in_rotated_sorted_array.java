package leetcode;
//���ֲ���
//������ת�����Ϊ������һ����һ����������ôͨ���ж���߻����ұ������Ϊ���������
//Ȼ�����ж������߻���������
public class N17search_in_rotated_sorted_array {
	  public boolean search(int[] A, int target) {
		  if (A == null || A.length < 1) {
	            return false;
	        }
	        int left = 0;
	        int right = A.length - 1;
	 
	        while (left <= right) {
	            int mid = (right + left) / 2;
	            if(A[mid]==target) return true;
	            if (A[left] < A[mid]) {
	                if ( A[mid] > target && A[left] <= target ) {
	                     
	                    right = mid - 1;
	                } else {
	                    left = mid + 1;
	                }
	            }
	            else if (A[left] > A[mid]) {
	                if ( A[mid] < target && A[right] >= target ) {
	                     
	                    left = mid + 1;
	                } else {
	                    right = mid - 1;
	                }
	            }
	            
	            else {
	                left ++;
	            }
	        }
	        return false;	    
	   }
	  
}
