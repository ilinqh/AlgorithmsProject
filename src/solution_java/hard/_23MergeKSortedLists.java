package solution_java.hard;

public class _23MergeKSortedLists {
    class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

    public class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            return merge(lists, 0, lists.length - 1);
        }

        ListNode merge(ListNode[] lists, int left, int right) {
            if (left == right) {
                return lists[left];
            }
            if (left > right) {
                return null;
            }
            int middle = left + ((right - left) >> 1);
            return mergeTwoListNode(merge(lists, left, middle), merge(lists, middle + 1, right));
        }

        ListNode mergeTwoListNode(ListNode left, ListNode right) {
            if (left == null) {
                return right;
            }
            if (right == null) {
                return left;
            }
            ListNode head = new ListNode(0);
            ListNode preV = head;
            while (left != null && right != null) {
                if (left.val <= right.val) {
                    preV.next = left;
                    left = left.next;
                } else {
                    preV.next = right;
                    right = right.next;
                }
                preV = preV.next;
            }
            if (left == null) {
                preV.next = right;
            }
            if (right == null) {
                preV.next = left;
            }
            return head.next;
        }
    }
}
