package DSA_JAVA;

public class LinkedListQn {

    public static void main(String[] args) {
        System.out.println("Question on reverseLinkedList");
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        System.out.println("Input on reverseLinkedList: ");
        printLinkedList(node1);
        System.out.println("Output on reverseLinkedList: ");
        ListNode reversed = reverseLinkedList(node1);
        printLinkedList(reversed);
    }

    // Singly LinkedList
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    // Given the beginning of a singly linked list head, reverse the list, and
    // return the new beginning of the list.
    public static ListNode reverseLinkedList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
    }

    public static void printLinkedList(ListNode node) {
        while (node.next != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
        System.out.print(node.val);
        System.out.println();
    }

}
