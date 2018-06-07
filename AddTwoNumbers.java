

import java.util.ArrayList;
import java.util.List;

public class test {
	public static void main(String[] args) {
		// System.out.print("aaa");
		 ListNode l1 = new ListNode(2);
		 l1.next = new ListNode(4);
		 l1.next.next = new ListNode(3);
		
		 ListNode l2 = new ListNode(5);
		 l2.next = new ListNode(6);
		 l2.next.next = new ListNode(4);

//		 ListNode l1 = new ListNode(1);
//		 l1.next = new ListNode(1);
//		 l1.next.next = new ListNode(1);
//		 l1.next.next.next = new ListNode(1);
//		 l1.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
//		 l1.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
//		
//		 ListNode l2 = new ListNode(1);
//		 l2.next = new ListNode(1);
		// l2.next.next = new ListNode(1);
		// l2.next.next.next = new ListNode(1);
		// l2.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next.next.next.next.next = new ListNode(1);
		// l2.next.next.next.next.next.next.next.next.next.next.next = new ListNode(1);

		// Number value1 = getValue(l1);
		// Number value2 = getValue(l2);
//		ListNode l1 = new ListNode(5);
//		ListNode l2 = new ListNode(5);

		ListNode resultNode = null;
		resultNode = getResult(l1, l2, resultNode, 0);
		getValue(resultNode);

	}

	public static ListNode getResult(ListNode l1, ListNode l2, ListNode resultNode, int pluseOne) {
		if (l1 != null || l2 != null) {
			int val1 = (l1 != null)? l1.val : 0;
			int val2 = (l2 != null)? l2.val : 0;
			int mPluseOne = 0;
			int sum = val1 + val2 + pluseOne;
			if (sum >= 10)
				mPluseOne = 1;
			resultNode = new ListNode(sum = sum % 10);
			if (l1 != null) l1 = l1.next;
	        if (l2 != null) l2 = l2.next;
			resultNode.next = getResult(l1, l2, resultNode.next, mPluseOne);
		} else if (pluseOne != 0) {
			resultNode = new ListNode(1);
		}
		return resultNode;
	}

	public static void getValue(ListNode listNode) {
		long value = listNode.val;
		int counter = 1;
		while (listNode.next != null) {
			value += listNode.next.val * Math.pow(10, counter);
			counter++;
			listNode = listNode.next;
		}
		System.out.println("input: " + value);
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
