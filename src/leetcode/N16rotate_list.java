package leetcode;
//��Ŀ����
//
//Given a list, rotate the list to the right by k places, where k is non-negative.
//
//For example:
//Given1->2->3->4->5->NULLand k =2,
//return4->5->1->2->3->NULL.
//˼·��
//
//1.����Ҫ������ĵ�����K����㣻
//
//2.��ѭ�����Ƶ�K��������ǰ�ԭ��˳�����У��ɿ�����һ���Ƚ��ȳ������� ������ �� ��K�����
//
//�洢�����������������״���
//
//3.���˽ⷨ�ռ临�Ӷ�ΪO(k);
//
//4.��������β��ӳɻ���Ȼ���ڵ�K�����ǰ�Ľ�㴦�Ͽ����ɣ�
//
//��leetcode�ϲ��������е�k�д���length of list ���������Ҫ�ȱ���һ��Ȼ��ʹk=k%(length of list),
//
//ʱ�临�Ӷ���ΪO(n).

//�������ȱ���һ�飬�ó�������len��ע��k���ܻ����len�����k%=len��
//��β���nextָ��ָ���׽ڵ㣬�γ�һ����������������len-k����������Ͽ������ǽ��

import ��ָoffer.ListNode;

public class N16rotate_list {
  public ListNode rotateRight(ListNode head,int k) {
	  if(k<=0||head==null) return head;
	  ListNode p1=head;
	  ListNode p2=head;
	  int length;//����������
//	  while(p1!=null)
//	  {
//		  p1=p1.next;
//		  length++;
//	  }
	  length=1;
	  while(p1.next!=null)//Ϊ�˵õ����һ���ڵ㣬������p1.next
	  {
		  p1=p1.next;
		  length++;
	  }
	  k=k%length;//k�п��ܴ��������ȣ�����������
	  
	  p1.next=head;
	  for(int i=0;i<length-k;i++) {
		  p1=p1.next;//�ߵ��Ͽ��Ľڵ�
	  }
	  ListNode newhead=p1.next;
	 p1.next=null;//�Ͽ��ڵ�ָ��null
	  return newhead;
  }
}
