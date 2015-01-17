package leetcode._002.add_two_numbers;

public class Solution {

	/*
	 * You are given two linked lists representing two non-negative numbers. The
	 * digits are stored in reverse order and each of their nodes contain a
	 * single digit. Add the two numbers and return it as a linked list.
	 * 
	 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode node =head;
		ListNode ln1 = l1;
		ListNode ln2 = l2;
		int dec = 0,num=0;
		while(ln1 != null || ln2 != null || dec != 0){
			num = dec;
			if(ln1 != null){
				num += ln1.val;
				ln1 = ln1.next;
			}
			if(ln2 != null){
				num += ln2.val;
				ln2 = ln2.next;
			}
			node.val = num  % 10;
			dec = num / 10;
			num = 0;
			
			if(ln1!= null || ln2 != null || dec != 0 ){
				node.next = new ListNode(0);
				node = node.next;
			}
			
		}
		
		return head;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode ln = s.addTwoNumbers(l1, l2);
		print(ln);
		
		l1.next.next.next = new ListNode(1);
		l2.next.next.next = new ListNode(9);
		ln = s.addTwoNumbers(l1, l2);
		print(ln);
		

		l1.next.next.next.next = new ListNode(9);
		ln = s.addTwoNumbers(l1, l2);
		print(ln);
	}
	
	public static void print(ListNode ln){
		while(ln != null){
			System.out.println(ln.val);
			ln = ln.next;
		}
		System.out.println("---");
	}

}
