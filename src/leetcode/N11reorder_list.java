package leetcode;
import 剑指offer.ListNode;
//Given a singly linked list L: L 0→L 1→…→L n-1→L n,
//reorder it to: L0→Ln →L1→Ln-1→L2→Ln-2→…
//
//You must do this in-place without altering the nodes' values.
//
//For example,
//Given{1,2,3,4}, reorder it to{1,4,2,3}.
public class N11reorder_list {
  public void reorderlist(ListNode head) {
	  if(head==null||head.next==null) return;//void 
	  
	   // 快满指针找到中间节点,slow为中间节点
      ListNode fast = head;
      ListNode slow = head;
      while(fast.next != null && fast.next.next != null){
          fast = fast.next.next;
          slow = slow.next;
      }
      
      ListNode mid=slow;
      
      // 拆分链表，并反转中间节点之后的链表
      ListNode p2 = mid.next;
      mid.next = null;//从中间断开，把链表分成两段
      ListNode p= null;
      ListNode q= p2;
      ListNode r= null;
      while(q!= null){
        r=q.next;//易错
        q.next=p;
        
        p=q;
        q=r;
      }
      ListNode head2=p;
      
      // 合并两个链表
      ListNode head1 = head;
  
      while(head!= null && head2!= null){
          ListNode p1temp = head1.next;//保存下一个节点，防止链表断开
          ListNode p2temp = head2.next;
          
          head1.next = head2;
          head1 = p1temp;
          
          head2.next = head1;        
          head2 = p2temp;        
      }
  }
}
