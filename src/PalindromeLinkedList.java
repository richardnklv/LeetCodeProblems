public class PalindromeLinkedList {

    // Given the head of a singly linked list, return true if it is a
    //palindrome
    // or false otherwise.
    //
    //
    //
    //Example 1:
    //
    //
    //Input: head = [1,2,2,1]
    //Output: true
    //Example 2:
    //
    //
    //Input: head = [1,2]
    //Output: false
    //


      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    class Solution {
        public boolean isPalindrome(ListNode head) {
            // bs
            if (head == null || head.next == null) {
                return true;
            }

            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            // handle the case for odd number of elements
            if (fast != null) {
                slow = slow.next;
            }

            // splitting the list in two halves
            prev.next = null;

            // reverse the second half
            ListNode secondHalf = reverse(slow);

            return comparison(head, secondHalf);

        }

        public boolean comparison(ListNode l1, ListNode l2) {
            while (l1 != null && l2 != null) {
                if (l1.val != l2.val) {
                    return false;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            return l1 == null && l2 == null;
        }



        private ListNode reverse(ListNode head) {
            ListNode prev = null, current = head, next;
            while (current != null) {
                next = current.next;

                //this line changes the pointer, so it points to the previous node
                current.next = prev;

                // iteration forward to continue loop
                prev = current;
                current = next;
            }
            return prev;
        }
    }
}
