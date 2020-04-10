public class Day10MinStack {

	Node head;

	public void push(int x) {
		if (head == null)
			head = new Node(x, x, null);
		else
			head = new Node(x, Math.min(x, head.min), head);
	}

	public void pop() {
		head = head.next;
	}

	public int top() {
		return head.val;
	}

	public int getMin() {
		return head.min;
	}
}

class Node {

	public Node(int val, int min, Node next) {
		this.val = val;
		this.min = min;
		this.next = next;
	}

	int val;
	int min;
	Node next;
}
