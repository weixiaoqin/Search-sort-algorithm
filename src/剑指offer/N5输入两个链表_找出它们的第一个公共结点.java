package 剑指offer;
//OK
public class N5输入两个链表_找出它们的第一个公共结点 {
	
	private int getlength(ListNode list) {
		 int n=0;
		 while(list!=null) {
			 n++;
			 list=list.next;
		 } 
		 return n;
	}	 
 public ListNode findFirstCommonNode(ListNode list1,ListNode list2) {
	 int len1=getlength(list1);
	 int len2=getlength(list2);
	 int m;
	 if(len1>=len2) {
		 m=len1-len2;
		 for(int i=0;i<m;i++) {
			 list1=list1.next;
		 }
	 }
	 else {
		 m=len2-len1; 
		 for(int i=0;i<m;i++) {
			 list2=list2.next;
		 }
	 }
	 
	 while(list1!=null&&list2!=null&&list1.val!=list2.val) {
		 list1=list1.next;
		 list2=list2.next;
	
	 }
	 
	 return list1;
		 
 }
  
 
 

}
