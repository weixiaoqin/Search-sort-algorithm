package leetcode;
import 剑指offer.ListNode;
//题目描述
//
//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//For example,
//Given1->4->3->2->5->2and x = 3,
//return1->2->2->4->3->5.
//题意：给定一个单链表和一个x，把链表中小于x的放到前面，大于等于x的放到后面，每部分元素的原始相对位置不变。
//
//思路：新建两个节点preHead1与preHead2，分别为指向两个链表的头结点。
//
//把节点值小于x的节点链接到链表1上，节点值大等于x的节点链接到链表2上。
//
//最后把两个链表相连即可

public class N12partition_list {
	public ListNode partition(ListNode head, int x) {
		if(head==null||head.next==null) return head;
		ListNode p1=new ListNode(0);//初始化两个节点
		ListNode p2=new ListNode(0);
		ListNode p1temp=p1;//保存初始头节点
		ListNode p2temp=p2;
		while(head!=null) {
			if(head.val<x) {
				p1.next=head;
				p1=p1.next;
			}
			else {
				p2.next=head;
				p2=p2.next;
			}
			head=head.next;
		}
		
		p1.next=p2temp.next;//两个链表相连
		p2.next=null;//记得最后节点指向null
		return p1temp.next;
	}
}
