package leetcode;
import ��ָoffer.ListNode;
//��Ŀ����
//
//Merge two sorted linked lists and return it as a new list.
//		The new list should be made by splicing together the nodes of the first two lists.
//�ϲ���������������ϲ�֮�������Ҳ��Ϊ�����
/*public class N15merge_two_sorted_lists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2)
  {
	  if(list1==null) return list2;
	  if(list2==null) return list1;
	  ListNode head;
	  if(list1.val<list2.val) {
		  head=list1;
		  head.next=mergeTwoLists(list1.next, list2);//�ݹ鷽��OK
	  }
	  else {
		  head=list2;
		  head.next=mergeTwoLists(list1, list2.next);
	  }
       return head; 
    }
}
*/

public class N15merge_two_sorted_lists {
	  public ListNode mergeTwoLists(ListNode list1, ListNode list2)
	  {
		  if(list1==null) return list2;
		  if(list2==null) return list1;
		  ListNode head=new ListNode(0);
		  ListNode p1=head;
		  while(list1!=null&&list2!=null)//ѭ������ok
		  {
			  if(list1.val<list2.val) {
				  p1.next=list1;
				  //p1=p1.next;
				  list1=list1.next;
			  }
			  else {
				  p1.next=list2;
				 
				  list2=list2.next;
			  }
			  
			 p1=p1.next;
		  }
		  if(list1!=null) {//p1�Ƚϳ�
			  p1.next=list1;
		  }
		  if(list2!=null) {//p2�Ƚϳ�
			  p1.next=list2;
		  }
		 
	       return head.next; 
	    }
	}