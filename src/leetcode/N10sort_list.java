package leetcode;
import 剑指offer.ListNode;

//Sort a linked list in O(n log n) time using constant space complexity.
//因为题目要求复杂度为O(nlogn),故可以考虑归并排序的思想。
//归并排序的一般步骤为：
//1）将待排序数组（链表）取中点并一分为二；
//2）递归地对左半部分进行归并排序；
//3）递归地对右半部分进行归并排序；
//4）将两个半部分进行合并（merge）,得到结果。
//
//所以对应此题目，可以划分为三个小问题：
//1）找到链表中点 （快慢指针思路，快指针一次走两步，慢指针一次走一步，快指针在链表末尾时，慢指针恰好在链表中点）；
//2）写出merge函数，即如何合并链表。 （见merge-two-sorted-lists 一题解析）
//3）写出mergesort函数，实现上述步骤。
//public class ListNode {
//
//	int val;
//	ListNode next=null;
//	
//	ListNode(int val){
//		this.val=val;
//	}
//}



/*public class N10sort_list {
	public ListNode sortList(ListNode head) 
	{
        if(head==null&&head.next==null) return head;
        ListNode p1=head;
        ListNode p2=getmid(head);
        mergeSort(p1,p2);
        
        
    }
	
	public ListNode getmid(ListNode head) {
		if(head==null&&head.next==null) return head;
		ListNode slow=head;
		ListNode fast=head.next;
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
			}
		}
		return slow;
	}
	 
	public void mergeSort(ListNode p1,ListNode p2) {
		if(p1==null) return p2;
		if(p2==null) return p1;
		ListNode head=new ListNode();
		while(p1!=null&&p2!=null) {
			if(p1.val<p2.val) {
				head.next=p1;
				p1=p1.next;
			}
			if(p1.val>p2.val) {
				head.next=p2;
				p2=p2.next;
			}
		}
		if(p1!=null) {
			head.next=p1;
		}
		
		if(p2!=null) {
			head.next=p2;
		}
      return head;
	}
}
*/
public class N10sort_list {
public ListNode sortList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }
    ListNode mid = getMid(head);
    ListNode midNext = mid.next;
    mid.next = null;//从中间断开链表
    return mergeSort(sortList(head), sortList(midNext));//递归，归并排序
}

private ListNode getMid(ListNode head) {//求中心节点
    if(head == null || head.next == null) {
        return head;
    }
    ListNode slow = head, quick = head;
    while(quick.next != null && quick.next.next != null) {
        slow = slow.next;
        quick = quick.next.next;
    }
    return slow;
}

private ListNode mergeSort(ListNode n1, ListNode n2) {//归并排序两个链表
    ListNode preHead = new ListNode(0);//初始化节点
    ListNode p1 = n1;
    ListNode p2 = n2;
    ListNode head = preHead;
    while(p1 != null && p2 != null) {
        if(p1.val < p2.val) {
            head.next = p1;
            p1 = p1.next;
        } 
        else {
            head.next = p2;
            p2 = p2.next;
        }
        head= head.next;
    }
    if(p1!= null){//链表1比较长
        head.next = p1;
    }
    if(p2 != null){////链2比较长,有剩余
        head.next = p2;
    }
    return preHead.next;//返回head
}
}