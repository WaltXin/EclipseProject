package TreeTest;
import java.util.*;

public class FullScan {

	public static void main(String[] args) {
		Node tree = createTree();
		//recurseFront(tree);
		//recurseMid(tree);
		//recurseEnd(tree);
		//levelOrderTraversal(tree);
		//depthOrderTraversal(tree);
		//System.out.println(maxDepth(tree));
		System.out.println(sumAllLeftLeaves(tree));
		System.out.println(sumAllLeftLeavesSolution(tree));
	}
	
	public static Node createTree() {
		Node head = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		Node leftLeft = new Node(4);
		Node leftRight = new Node(5);
		Node rightLeft = new Node(6);
		Node rightRight = new Node(7);
		Node left3 = new Node(8);
		
		//init tree
		head.setLeftNode(left);
		head.setRightNode(right);
		left.setLeftNode(leftLeft);
		left.setRightNode(leftRight);
		right.setLeftNode(rightLeft);
		right.setRightNode(rightRight);
		leftLeft.setLeftNode(left3);
		
		return head;
	}
	/**
	 * front recurse go to the left node first them right node
	 * */
	public static void recurseFront(Node head) {
		if (head == null) return;
		System.out.println("Node info: " + head.value);
		recurseFront(head.getLeftNode());
		recurseFront(head.getRightNode());
	}
	
	public static void recurseMid(Node head) {
		if (head == null) return;
		recurseMid(head.getLeftNode());
		System.out.println("Node info: " + head.value);
		recurseMid(head.getRightNode());
	}
	
	public static void recurseEnd(Node head) {
		if (head == null) return;
		recurseEnd(head.getLeftNode());
		recurseEnd(head.getRightNode());
		System.out.println("Node info: " + head.getValue());
	}
	
	public static void levelOrderTraversal(Node head) {
		if (head == null) return;
		ArrayDeque<Node> queue = new ArrayDeque<Node>();
		queue.addLast(head);
		
		while(!queue.isEmpty()) {
			Node n = queue.removeFirst();
			System.out.println(n.value);
			if (n.leftNode != null) {
				queue.addLast(n.leftNode);
			}
			if (n.rightNode != null) {
				queue.addLast(n.rightNode);
			}
		}
	}
	
	public static void depthOrderTraversal(Node head) {
		if (head == null) return;
		ArrayDeque<Node> stack = new ArrayDeque<Node>();
		stack.addFirst(head);
		
		while(!stack.isEmpty()) {
			Node n = stack.removeFirst();
			System.out.println(n.value);
			if (n.rightNode != null) {
				stack.addFirst(n.rightNode);
			}
			if (n.leftNode != null) {
				stack.addFirst(n.leftNode);
			}
		}
	}
	
	/**
	 * Calculate the max depth of tree
	 * */
	public static int maxDepth(Node head) {
		if (head == null) return 0;
		return 1 + Math.max(maxDepth(head.leftNode), maxDepth(head.rightNode));
	}
	
	/* *
	 *Invert left node to right node
	 *     1               1   
	 *   /   \   ----->  /   \
	 *  2     3         3     2
	 * */
	public static Node swapLeftRightNodeSolution(Node head) {
		if (head == null) return head;
		Node tem = head.leftNode;
		head.leftNode = swapLeftRightNodeSolution(head.rightNode);
		head.rightNode = swapLeftRightNodeSolution(tem);
		
		return head;
	}
	
	public static int sumAllLeftLeaves(Node head) {
		if (head == null) return 0;
		int sum = 0;
		ArrayDeque<Node> stack = new ArrayDeque<Node>();
		stack.addFirst(head);
		while(!stack.isEmpty()) {
			Node n = stack.removeFirst();
			if (n.leftNode != null && n.leftNode.leftNode == null && n.leftNode.rightNode == null) {
				sum += n.leftNode.value;
			}
			if (n.rightNode != null) {
				stack.addFirst(n.rightNode);
			}
			if (n.leftNode != null) {
				stack.addFirst(n.leftNode);
			}
		}	
		return sum;
	}
	
	public static int sumAllLeftLeavesSolution(Node head) {
		if (head == null) return 0;
		int result = recurseMethod(head, false, 0);
		return result;
	}
	
	public static int recurseMethod(Node n,  boolean f, int sum) {
		if (n == null) return sum;
		if (f == true && n.leftNode == null && n.rightNode == null) {
			return sum + n.value;
		}
		int leftSum = recurseMethod(n.leftNode, true, sum);
		return recurseMethod(n.rightNode, false, leftSum);
	}


}
