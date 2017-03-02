package LeetCode;

import java.util.*;

public class RemoveNode {

	public static void main(String[] args) {
		ListNode head = createNodeList();
		ListNode del = new ListNode(3);
		deleteNode(head, del);
	}
	public static class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	
	public static ListNode createNodeList() {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}
	
    public static void deleteNode(ListNode node, ListNode del) {
        if (node == null) return;
        if (node.val == del.val){ node = node.next; return;}
        while (node.next != null) {
        	if (node.next.val == del.val) {
        		if (node.next.next != null) {
        			node.next = node.next.next;
        		} else {
        			node.next = null;
        		}
        	} else {
        		deleteNode(node, del);
        	}
        }
    }

}
