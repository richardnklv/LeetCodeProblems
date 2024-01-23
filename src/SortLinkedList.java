import java.util.LinkedList;
public class SortLinkedList {

    // Definition for singly-linked list.
    public class ListNode {
         int val;
        ListNode next;
        ListNode() {}
         ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        // merge sort >:D funny
        public ListNode sortList(ListNode head) {
            // Null check
            if (head == null || head.next == null) {
                return head;
            }

            // Here we further use recursion, but the sortedMerge uses two values
            // thus we split the list each time.
            ListNode middle = getMiddle(head);
            ListNode nextMiddle = middle.next;
            middle.next = null;

            ListNode left = sortList(head);
            ListNode right = sortList(nextMiddle);

            return sortedMerge(left, right);
        }

        // 2-pointers, slow(1 move at a time) and fast(2 moves at a time)
        private ListNode getMiddle(ListNode head) {
            // Check for null
            if (head == null) {
                return head;
            }

            ListNode slow = head, fast = head;

            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            // When fast has reached the end, slow will have reached the middle
            return slow;

        }

        // Recursive function, but it takes two variables;
        // This function is further recursively used in the main SortList after
        // splitting into two
        private ListNode sortedMerge(ListNode a, ListNode b) {
            ListNode result = null;
            // If empty
            if (a == null) {
                return b;
            } else if (b == null) {
                return a;
            }
            // Actual function
            if (a.val <= b.val) {
                result = a;
                result.next = sortedMerge(a.next, b);
            } else {
                result = b;
                result.next = sortedMerge(a, b.next);
            }
            return result;
        }
    }
}
