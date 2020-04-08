//	  Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

class Day8MiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null) {
			if (fast.next == null)
				return slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
