package leetcode;
import 剑指offer.ListNode;
//题目描述
//
//Given a sorted linked list, delete all nodes that have duplicate numbers, 
//leaving only distinct numbers from the original list.
//
//For example,
//Given1->2->3->3->4->4->5, return1->2->5.
//Given1->1->1->2->3, return2->3.
//删除重复节点，头结点也可能被删除
//首先要找到第一个非重复的节点作为头结点，
//直接找比较麻烦，可以添加一个新结点newHead作为伪头结点，
//最后返回newHead->next即可。
public class N13remove_duplicates_from_sorted_list {
	 public ListNode deleteDuplicates(ListNode head) {
	        if(head==null||head.next==null)//如果是空，或者只有一个节点
	            return head;
	        ListNode newHead = new ListNode(head.val-1);//初始化新的头结点
	        newHead.next = head;
	        ListNode cur = head;
	        ListNode last = newHead;//last 为不重复的节点，不用删除的节点
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
	                	 cur = cur.next;//当节点相等时，往后移
	                }
	                 //直到不重复的节点出现  
	                last.next = cur.next;
	            }
	            
	            cur = cur.next;//当前指针后移
	        }
	        return newHead.next;	  //rerurn last，是不重复的节点

	    }
}
