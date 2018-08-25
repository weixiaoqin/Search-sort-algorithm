package leetcode;
//Given a linked list, determine if it has a cycle in it.

//Follow up:
//Can you solve it without using extra space?
public class N07linked_list_cycle_boolean {
        public boolean hasCycle(ListNode head) {
        	if(head==null||head.next==null) return false;
        	ListNode slow=head;
        	ListNode fast=head.next;
        	while(slow!=null&&fast!=null) {
        		if(fast==slow) return true;
        		slow=slow.next;
        		fast=fast.next;
        		if(fast!=null) {
        			fast=fast.next;
        		}
        	}
        	return false;
        }
}
