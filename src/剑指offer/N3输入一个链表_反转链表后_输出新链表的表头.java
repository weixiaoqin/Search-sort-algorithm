package ��ָoffer;

public class N3����һ������_��ת�����_���������ı�ͷ {
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



