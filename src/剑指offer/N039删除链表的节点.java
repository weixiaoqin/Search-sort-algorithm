package ��ָoffer;
//��O(1)ʱ����ɾ������ڵ�
//����һ�����������ͷָ���һ���ڵ�ָ�룬ɾ���ýڵ�
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

public class N039ɾ������Ľڵ� {
	public static void main(String[] args) {
//		LinkedList<ListNode> list=new LinkedList();
		ListNode h=new ListNode(0);//��ʼ��ͷ���
		ListNode node=h;//����һ���ڵ�
		for(int i=0;i<10;i++) {
			
			node.next=new ListNode(i);//new������һ���ڵ�
			node=node.next;//�ڵ����
//			list.add(node);
		}
		node.next=null;
		print(h);
//		ListNode p=new ListNode(5);//,����Ҫɾ���Ľڵ㣬���ܵ���newһ���ڵ���Ϊɾ���Ľڵ�
//		ListNode p=h.next;//�ڶ����ڵ���Ϊɾ���Ľڵ�OK
//		ListNode p=node;//ɾ���Ľڵ�Ϊβ�ڵ�OK
		ListNode p=h;//ɾ��ͷ���OK
		delete(h,p);
		
		print(h);
		
	}
  public static void delete(ListNode head,ListNode p) {//ɾ���ڵ�
	  if(head==null||p==null) return;
	  if(p.next!=null) {//���p����β�ڵ㣨ͷ���Ҳ�㣩
		 ListNode q=p.next;
		 p.val=q.val;//���Ҫɾ�Ľڵ�ֵp����һ���ڵ�q���Ƶ�p��
		 p.next=q.next;//��ָ��ָ��q����һ���ڵ�
		 
	  }
	  else if(head==p&&head.next==null) {//����ֻ��һ���ڵ㣬���Ҫɾ���Ľڵ���ͷ��㣨Ҳ��β�ڵ㣩
		  head=null;
		  p=null;
	  }
	  else if(p.next==null){//p��β�ڵ�
		  ListNode node=head;
		  while(node.next!=p) {//��ͷ������Ҫɾ���Ľڵ�
			  node=node.next;
		  }
		  node.next=null;//��Ҫɾ���Ľڵ�p��ǰһ���ڵ�ָ��null;���ó�β�ڵ�
	  }
  }
  
  public static void print(ListNode head) {//��ӡ����
	  if(head==null) return;
	  ListNode n=head;
	  while(n!=null) {
		  System.out.println(n.val);
		  n=n.next;
		 
	  }
	  System.out.println();
  }
  
}
