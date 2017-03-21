package ClassProject;

public class LinkedListSolution {

	public static void main(String[] args) {
		ListNode head = createNodeList();
		reverseListNode(head);
	}
	
	public static ListNode createNodeList(){
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		return n1;
	}
	public static ListNode reverseListNode(ListNode head) {
		if(head==null || head.next==null)
            return head;
        ListNode nextNode=head.next;
        ListNode newHead=reverseListNode(nextNode);
        System.out.println(head.val);
        nextNode.next=head;
        head.next=null;
        return newHead;
	}

}
