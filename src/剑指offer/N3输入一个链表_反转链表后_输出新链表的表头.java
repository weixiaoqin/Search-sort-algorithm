package 剑指offer;

public class N3输入一个链表_反转链表后_输出新链表的表头 {
 public ListNode ReverseList(ListNode head) {
	 if(head==null) {
		 return null;
	 }
	 ListNode p=null;
	 ListNode q=head;
	 ListNode r=null;
	  while(q!=null) {
		  r=q.next;
		  q.next=p;
		  
		  p=q;
		  q=r;
	  }
	  return p;
	  
 }
 
}



