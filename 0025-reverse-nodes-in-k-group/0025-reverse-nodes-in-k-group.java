class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode kth = getKthNode(temp, k);

            if(kth == null) {
                if(prev != null) {
                    prev.next = temp;
                }
                break;
            }

            ListNode newnode = kth.next;
            kth.next = null;

            ListNode reversedHead = reverseList(temp);

            if(prev == null) {
                head = reversedHead;
            }
            else {
                prev.next = reversedHead;
            }

            prev = temp;
            temp = newnode;
        }

        return head;
    }

    private ListNode reverseList(ListNode head) {
        ListNode previous = null;
        ListNode current = head;

        while(current != null) {
            ListNode front = current.next;
            current.next = previous;
            previous = current;
            current = front;
        }

        return previous;
    }

    private ListNode getKthNode(ListNode current, int k) {
        while(current != null && k > 1) {
            current = current.next;
            k--;
        }

        return current;
    }
}