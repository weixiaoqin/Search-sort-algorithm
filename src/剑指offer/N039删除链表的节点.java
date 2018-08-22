package 剑指offer;
//在O(1)时间内删除链表节点
//给定一个单向链表的头指针和一个节点指针，删除该节点
//public class ListNode {
//
//	int val;
//	ListNode next=null;
//	
//	ListNode(int val){
//		this.val=val;
//	}
//}

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class N039删除链表的节点 {
	public static void main(String[] args) {
//		LinkedList<ListNode> list=new LinkedList();
		ListNode h=new ListNode(0);//初始化头结点
		ListNode node=h;//定义一个节点
		for(int i=0;i<10;i++) {
			
			node.next=new ListNode(i);//new构造下一个节点
			node=node.next;//节点后移
//			list.add(node);
		}
		node.next=null;
		print(h);
//		ListNode p=new ListNode(5);//,给定要删除的节点，不能单独new一个节点作为删除的节点
//		ListNode p=h.next;//第二个节点作为删除的节点OK
//		ListNode p=node;//删除的节点为尾节点OK
		ListNode p=h;//删除头结点OK
		delete(h,p);
		
		print(h);
		
	}
  public static void delete(ListNode head,ListNode p) {//删除节点
	  if(head==null||p==null) return;
	  if(p.next!=null) {//如果p不是尾节点（头结点也算）
		 ListNode q=p.next;
		 p.val=q.val;//则把要删的节点值p的下一个节点q复制到p，
		 p.next=q.next;//把指针指向q的下一个节点
		 
	  }
	  else if(head==p&&head.next==null) {//链表只有一个节点，如果要删除的节点是头结点（也是尾节点）
		  head=null;
		  p=null;
	  }
	  else if(p.next==null){//p是尾节点
		  ListNode node=head;
		  while(node.next!=p) {//从头遍历到要删除的节点
			  node=node.next;
		  }
		  node.next=null;//把要删除的节点p的前一个节点指向null;设置成尾节点
	  }
  }
  
  public static void print(ListNode head) {//打印链表
	  if(head==null) return;
	  ListNode n=head;
	  while(n!=null) {
		  System.out.println(n.val);
		  n=n.next;
		 
	  }
	  System.out.println();
  }
  
}
