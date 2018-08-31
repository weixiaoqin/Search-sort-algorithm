package leetcode;
import ��ָoffer.ListNode;
//��Ŀ����
//
//Given a sorted linked list, delete all nodes that have duplicate numbers, 
//leaving only distinct numbers from the original list.
//
//For example,
//Given1->2->3->3->4->4->5, return1->2->5.
//Given1->1->1->2->3, return2->3.
//ɾ���ظ��ڵ㣬ͷ���Ҳ���ܱ�ɾ��
//����Ҫ�ҵ���һ�����ظ��Ľڵ���Ϊͷ��㣬
//ֱ���ұȽ��鷳���������һ���½��newHead��Ϊαͷ��㣬
//��󷵻�newHead->next���ɡ�
public class N13remove_duplicates_from_sorted_list {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null)//����ǿգ�����ֻ��һ���ڵ�
	            return head;
	        ListNode newHead = new ListNode(head.val-1);//��ʼ���µ�ͷ���
	        newHead.next = head;
	        ListNode cur = head;
	        ListNode last = newHead;//last Ϊ���ظ��Ľڵ㣬����ɾ���Ľڵ�
	        while(cur!=null&&cur.next!=null)
	        {
	             
	            if(cur.val!=cur.next.val)
	            {
	                last = cur;
	            }
	            
	            else
	            {
	                while(cur.next!=null&&cur.val==cur.next.val)
	                {
	                	 cur = cur.next;//���ڵ����ʱ��������
	                }
	                 //ֱ�����ظ��Ľڵ����  
	                last.next = cur.next;
	            }
	            
	            cur = cur.next;//��ǰָ�����
	        }
	        return newHead.next;	  //rerurn last���ǲ��ظ��Ľڵ�

	    }
}
