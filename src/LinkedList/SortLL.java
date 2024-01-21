package LinkedList;

public class SortLL {

    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node fast = head;
        Node slow = head;
        Node prev = null;
        Node first = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = null;

        Node second = slow;

        Node left = mergeSort(first);

        Node right = mergeSort(second);

        return merge(left, right);
    }


    static Node merge(Node left, Node right) {

        Node node = new Node(0);
        Node temp = node;
        while (left != null && right != null) {
            if (left.data < right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (right == null) {
            temp.next = left;
        }

        if (left == null) {
            temp.next = right;
        }

        return node.next;
    }

}
