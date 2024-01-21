package LinkedList;


public class Add1toLL {
    public static Node addOne(Node head) {


        int carry = 0;
        Node currentHead = reverseList(head);
        Node temp = currentHead;
        Node prev = null;
        Node temp1 = currentHead;
        while (temp != null) {
            int sum = 0;
            if (prev == null) {
                sum = temp.data + 1;
            } else {
                sum = temp.data + carry;

            }

            carry = sum / 10;
            temp.data = sum % 10;
            prev = temp;
            temp = temp.next;

        }
        if (carry == 1) {
            Node carryNode = new Node(1);
            prev.next = carryNode;
        }

        return reverseList(temp1);
    }


    public static Node reverseList(Node head) {
        Node prevNode = null;
        Node currentNode = head;
        while (currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;

        }
        head = prevNode;

        return head;

    }
}
