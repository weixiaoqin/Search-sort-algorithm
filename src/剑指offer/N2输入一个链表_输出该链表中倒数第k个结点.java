package 剑指offer;

//OK
import java.awt.List;

public class N2输入一个链表_输出该链表中倒数第k个结点 {
	public ListNode FindKthToTail(ListNode head,int k) {
		if(head==null||k<=0) return null;
		
		ListNode p1=head;
		ListNode p2=head;
		
		for(int i=0;i<k-1;i++) {
			p1=p1.next;
			if(p1==null) //k>length
			{
				return null;
			}
		}
		while(p1.next!=null) {
			p1=p1.next;
			p2=p2.next;
		}
		return p2;
		
	}
}
