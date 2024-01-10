package linkedlist;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLL {
    /*
        Given the head of a singly linked list, reverse the list, and return the reversed list
     */

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            // keep track of next node
            ListNode next = curr.next;
            // update curr's next pointer to the previous node
            curr.next = prev;
            // update previous node to the current node
            prev = curr;
            // update current node to be the next node
            curr = next;
        }
        // prev will be the last node in the list
        return prev;
    }
}
