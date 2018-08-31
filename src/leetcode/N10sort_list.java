package leetcode;
import ��ָoffer.ListNode;

//Sort a linked list in O(n log n) time using constant space complexity.
//��Ϊ��ĿҪ���Ӷ�ΪO(nlogn),�ʿ��Կ��ǹ鲢�����˼�롣
//�鲢�����һ�㲽��Ϊ��
//1�������������飨����ȡ�е㲢һ��Ϊ����
//2���ݹ�ض���벿�ֽ��й鲢����
//3���ݹ�ض��Ұ벿�ֽ��й鲢����
//4���������벿�ֽ��кϲ���merge��,�õ������
//
//���Զ�Ӧ����Ŀ�����Ի���Ϊ����С���⣺
//1���ҵ������е� ������ָ��˼·����ָ��һ������������ָ��һ����һ������ָ��������ĩβʱ����ָ��ǡ���������е㣩��
//2��д��merge����������κϲ����� ����merge-two-sorted-lists һ�������
//3��д��mergesort������ʵ���������衣
//public class ListNode {
//
//	int val;
//	ListNode next=null;
//	
//	ListNode(int val){
//		this.val=val;
//	}
//}



/*public class N10sort_list {
	public ListNode sortList(ListNode head) 
	{
        if(head==null&&head.next==null) return head;
        ListNode p1=head;
        ListNode p2=getmid(head);
        mergeSort(p1,p2);
        
        
    }
	
	public ListNode getmid(ListNode head) {
		if(head==null&&head.next==null) return head;
		ListNode slow=head;
		ListNode fast=head.next;
		while(fast!=null) {
			slow=slow.next;
			fast=fast.next;
			if(fast!=null) {
				fast=fast.next;
			}
		}
		return slow;
	}
	 
	public void mergeSort(ListNode p1,ListNode p2) {
		if(p1==null) return p2;
		if(p2==null) return p1;
		ListNode head=new ListNode();
		while(p1!=null&&p2!=null) {
			if(p1.val<p2.val) {
				head.next=p1;
				p1=p1.next;
			}
			if(p1.val>p2.val) {
				head.next=p2;
				p2=p2.next;
			}
		}
		if(p1!=null) {
			head.next=p1;
		}
		
		if(p2!=null) {
			head.next=p2;
		}
      return head;
	}
}
*/
public class N10sort_list {
public ListNode sortList(ListNode head) {
    if(head == null || head.next == null) {
        return head;
    }
    ListNode mid = getMid(head);
    ListNode midNext = mid.next;
    mid.next = null;//���м�Ͽ�����
    return mergeSort(sortList(head), sortList(midNext));//�ݹ飬�鲢����
}

private ListNode getMid(ListNode head) {//�����Ľڵ�
    if(head == null || head.next == null) {
        return head;
    }
    ListNode slow = head, quick = head;
    while(quick.next != null && quick.next.next != null) {
        slow = slow.next;
        quick = quick.next.next;
    }
    return slow;
}

private ListNode mergeSort(ListNode n1, ListNode n2) {//�鲢������������
    ListNode preHead = new ListNode(0);//��ʼ���ڵ�
    ListNode p1 = n1;
    ListNode p2 = n2;
    ListNode head = preHead;
    while(p1 != null && p2 != null) {
        if(p1.val < p2.val) {
            head.next = p1;
            p1 = p1.next;
        } 
        else {
            head.next = p2;
            p2 = p2.next;
        }
        head= head.next;
    }
    if(p1!= null){//����1�Ƚϳ�
        head.next = p1;
    }
    if(p2 != null){////��2�Ƚϳ�,��ʣ��
        head.next = p2;
    }
    return preHead.next;//����head
}
}