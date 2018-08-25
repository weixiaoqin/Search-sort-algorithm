package leetcode;

import 剑指offer.ListNode;

//Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

//Follow up:
//Can you solve it without using extra space?
//1、快慢指针先判断有无环，2、环的节点数n 3、求环的入口节点

public class N06linked_list_cycle {
	 public ListNode detectCycle(ListNode head) {
	        if(head==null) return null;
	        if(meet(head)==null) return null;//如果链表没有环
	        else {
	        	ListNode m=meet(head);
	        	int n=count(m);
	        	return entry(head,n);
	        }
	       
	        
	    }
	 
	 public ListNode meet(ListNode head) {//快慢指针先判断有无环
     	ListNode slow=head;
	        ListNode fast=head.next;
     	while(slow!=null&&fast!=null) {
	        	slow=slow.next;
	        	fast=fast.next;
	        	if(fast!=null) {
	        		fast=fast.next;
	        	}
	        	if(fast==slow) {
	        		return fast;
	        	}
	        }
     	return null;
     }
     
     public int count(ListNode m) {//、环的节点数n 
     	ListNode p=m;
        int n=1;
        while(p.next!=m) {
     	   p=p.next;
     	   n++;
        }
        return n;
     	
     }
     
     public ListNode entry(ListNode head,int n) {
     	ListNode p1=head;
     	ListNode p2=head;
     	for(int i=0;i<n;i++) {
     		p1=p1.next;
     	}
     	while(p1!=p2) {
     		p1=p1.next;
     		p2=p2.next;
     	}
     	return p1;
     }
     
}
