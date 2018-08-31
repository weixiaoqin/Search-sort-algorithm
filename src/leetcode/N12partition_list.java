package leetcode;
import ��ָoffer.ListNode;
//��Ŀ����
//
//Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
//
//You should preserve the original relative order of the nodes in each of the two partitions.
//
//For example,
//Given1->4->3->2->5->2and x = 3,
//return1->2->2->4->3->5.
//���⣺����һ���������һ��x����������С��x�ķŵ�ǰ�棬���ڵ���x�ķŵ����棬ÿ����Ԫ�ص�ԭʼ���λ�ò��䡣
//
//˼·���½������ڵ�preHead1��preHead2���ֱ�Ϊָ�����������ͷ��㡣
//
//�ѽڵ�ֵС��x�Ľڵ����ӵ�����1�ϣ��ڵ�ֵ�����x�Ľڵ����ӵ�����2�ϡ�
//
//��������������������

public class N12partition_list {
	public ListNode partition(ListNode head, int x) {
		if(head==null||head.next==null) return head;
		ListNode p1=new ListNode(0);//��ʼ�������ڵ�
		ListNode p2=new ListNode(0);
		ListNode p1temp=p1;//�����ʼͷ�ڵ�
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
		
		p1.next=p2temp.next;//������������
		p2.next=null;//�ǵ����ڵ�ָ��null
		return p1temp.next;
	}
}
