public class AddTwoSum {

	// 重用了　l1 
	private ListNode addTwoSum(ListNode l1, ListNode l2) {
	    boolean carry = false;
	    ListNode l3 = l1;
	    ListNode pre = l1;
	    while (l1 != null && l2 != null) {
	        l1.val += l2.val;
	        if (carry) {
	            l1.val += 1;
	        }
	        if (l1.val >= 10) {
	            carry = true;
	            l1.val -= 10;
	        } else {
	            carry = false;
	        }
	        pre = l1;
	        l1 = l1.next;
	        l2 = l2.next;
	    }
	    if (l2 != null) {
	        l1 = l2;
	        pre.next = l1;
	    }
	    if (carry) {
	        if (l1 != null) {
	            do {
	                l1.val += 1;
	                if (l1.val >= 10) {
	                    carry = true;
	                    l1.val -= 10;
	                } else {
	                    carry = false;
	                    break;
	                }
	                pre = l1;
	                l1 = l1.next;
	            } while (l1 != null);
	            if (carry) {
	                l1 = new ListNode(1);
	                pre.next = l1;
	            }
	        } else {
	            l1 = new ListNode(1);
	            pre.next = l1;
	        }
	    }
	    return l3;
	}
}