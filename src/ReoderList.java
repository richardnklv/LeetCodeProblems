public class ReoderList {


    /* You are given the head of a singly linked-list. The list can be represented as:

    L0 → L1 → … → Ln - 1 → Ln
    Reorder the list to be on the following form:

    L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
    You may not modify the values in the list's nodes. Only nodes themselves may be changed.



    Example 1:


    Input: head = [1,2,3,4]
    Output: [1,4,2,3]
    Example 2:


    Input: head = [1,2,3,4,5]
    Output: [1,5,2,4,3]*/

      // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    class Solution {
        public void reorderList(ListNode head) {

            // some bullshit
            if (head == null || head.next == null) {
                return;
            }

            // finding the middle of the list by 2 pointers, fast moving by 2, and slow by 1.
            ListNode slow = head, fast = head, prev = null;
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }

            // splitting the list in two halves
            prev.next = null;

            // reverse the second half
            ListNode secondHalf = reverse(slow);

            // merging to get answer
            merge(head, secondHalf);
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

        // merge them one element at a time, switching between both lists, as thats the exercise problem
        private void merge(ListNode l1, ListNode l2) {
            while (l1 != null && l2 != null) {

                // values for the pointers
                ListNode temp1 = l1.next, temp2 = l2.next;

                // asigning pointers
                l1.next = l2;
                if (temp1 == null) break;
                l2.next = temp1;

                // iterate forward
                l1 = temp1;
                l2 = temp2;
            }
        }
    }

}
