package leetcode;
//��Ŀ����
//
//Given a sorted linked list, delete all duplicates such that each element appear only once.
//
//For example,
//Given1->1->2, return1->2.
//Given1->1->2->3->3, return1->2->3.
//ɾ���ظ��Ľڵ㣬ֻ����һ��


public class N14remove_duplicates_from_sorted_list1 {
	public ListNode deleteDuplicates(ListNode head) 
	{
		 if(head==null||head.next==null)//����ǿգ�����ֻ��һ���ڵ�
	            return head;
		 
		 ListNode p=head;
		 while(p!=null)
		 {
			 while(p.next!=null&&p.val==p.next.val) {
				 p.next=p.next.next;
			 }
			 p=p.next;
		 }
		 return head;
	}
}
