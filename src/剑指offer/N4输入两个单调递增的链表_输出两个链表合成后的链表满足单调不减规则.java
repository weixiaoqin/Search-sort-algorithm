package 剑指offer;
//ok
public class N4输入两个单调递增的链表_输出两个链表合成后的链表满足单调不减规则 {
	public ListNode Merge(ListNode list1,ListNode list2) {
		if(list1==null) return list2;
		if(list2==null) return list1;
		ListNode head=null;
		if(list1.val<=list2.val) {
			head=list1;
			head.next=Merge(list1.next,list2);
			
		}
		
		else {
			head=list2;
			head.next=Merge(list1,list2.next);
		}
		return head;
	}
}
