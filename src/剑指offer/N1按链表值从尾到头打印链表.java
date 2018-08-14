package 剑指offer;
//OK
import java.util.ArrayList;
import java.util.Stack;

public class N1按链表值从尾到头打印链表 {
	
 public ArrayList<Integer> printListFromTailToHead(ListNode head) {
        ArrayList<Integer> list1=new ArrayList<>();
        if(head==null) return list1;
        
        Stack<Integer> st=new Stack<>();
        ListNode node=head;
        while(node!=null) {
        	st.add(node.val);
        	node=node.next;
        	
  
        }
        
        while(!st.isEmpty()) {
        	list1.add(st.pop());
        }
        
        return list1;
        
    }
 
}
