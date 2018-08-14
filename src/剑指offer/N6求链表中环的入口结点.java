package 剑指offer;

public class N6求链表中环的入口结点 {
	
	private ListNode meetingNode(ListNode head) {//there is a  loop or not
		if(head==null) {
			return null;
		}
		ListNode pslow=head;
		ListNode pfast=pslow.next;
		
		while(pslow!=null&&pfast!=null) {
			pslow=pslow.next;
			pfast=pfast.next;
			if(pfast!=null) {
				pfast=pfast.next;
			}
			if(pfast==pslow) {
				return pfast;
			}
			
		}
		return null;
		
	}
	
	 public ListNode EntryNodeOfLoop(ListNode phead)
	    {
	       ListNode meet=meetingNode(phead);
	       if(meet==null)return null;
	       ListNode list1=meet;
	       int n=1;
	       while(list1.next!=meet) {//length of loop :n
	    	   list1=list1.next;
	    	   n++;
	       }
	       
	      ListNode p1=phead;
	      ListNode p2=phead;
	       for(int i=0;i<n;i++) {
	    	   p1=p1.next;
	    	
	       }
	       
	       while(p1!=p2) {//the entry of loop
	    	   p1=p1.next;
	    	   p2=p2.next;
	       }
	       return p1;
	    }
	 
}
