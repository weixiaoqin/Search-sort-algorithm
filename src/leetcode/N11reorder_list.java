package leetcode;
import ��ָoffer.ListNode;
//Given a singly linked list L: L 0��L 1������L n-1��L n,
//reorder it to: L0��Ln ��L1��Ln-1��L2��Ln-2����
//
//You must do this in-place without altering the nodes' values.
//
//For example,
//Given{1,2,3,4}, reorder it to{1,4,2,3}.
public class N11reorder_list {
  public void reorderlist(ListNode head) {
	  if(head==null||head.next==null) return;//void 
	  
	   // ����ָ���ҵ��м�ڵ�,slowΪ�м�ڵ�
      ListNode fast = head;
      ListNode slow = head;
      while(fast.next != null && fast.next.next != null){
          fast = fast.next.next;
          slow = slow.next;
      }
      
      ListNode mid=slow;
      
      // �����������ת�м�ڵ�֮�������
      ListNode p2 = mid.next;
      mid.next = null;//���м�Ͽ���������ֳ�����
      ListNode p= null;
      ListNode q= p2;
      ListNode r= null;
      while(q!= null){
        r=q.next;//�״�
        q.next=p;
        
        p=q;
        q=r;
      }
      ListNode head2=p;
      
      // �ϲ���������
      ListNode head1 = head;
  
      while(head!= null && head2!= null){
          ListNode p1temp = head1.next;//������һ���ڵ㣬��ֹ����Ͽ�
          ListNode p2temp = head2.next;
          
          head1.next = head2;
          head1 = p1temp;
          
          head2.next = head1;        
          head2 = p2temp;        
      }
  }
}
