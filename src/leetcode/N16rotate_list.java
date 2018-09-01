package leetcode;
//题目描述
//
//Given a list, rotate the list to the right by k places, where k is non-negative.
//
//For example:
//Given1->2->3->4->5->NULLand k =2,
//return4->5->1->2->3->NULL.
//思路：
//
//1.首先要找链表的倒数第K个结点；
//
//2.因循环右移的K个结点仍是按原来顺序排列，可考虑用一个先进先出的容器 即队列 将 后K个结点
//
//存储，依次连接在链表首处；
//
//3.但此解法空间复杂度为O(k);
//
//4.将链表首尾相接成环，然后在第K个结点前的结点处断开即可；
//
//因leetcode上测试用例中的k有大于length of list 的情况，故要先遍历一遍然后使k=k%(length of list),
//
//时间复杂度仍为O(n).

//分析：先遍历一遍，得出链表长度len，注意k可能会大于len，因此k%=len。
//将尾结点next指针指向首节点，形成一个环，接着往后跑len-k步，从这里断开，就是结果

import 剑指offer.ListNode;

public class N16rotate_list {
  public ListNode rotateRight(ListNode head,int k) {
	  if(k<=0||head==null) return head;
	  ListNode p1=head;
	  ListNode p2=head;
	  int length;//先求链表长度
//	  while(p1!=null)
//	  {
//		  p1=p1.next;
//		  length++;
//	  }
	  length=1;
	  while(p1.next!=null)//为了得到最后一个节点，所以用p1.next
	  {
		  p1=p1.next;
		  length++;
	  }
	  k=k%length;//k有可能大于链表长度，所以求余数
	  
	  p1.next=head;
	  for(int i=0;i<length-k;i++) {
		  p1=p1.next;//走到断开的节点
	  }
	  ListNode newhead=p1.next;
	 p1.next=null;//断开节点指向null
	  return newhead;
  }
}
