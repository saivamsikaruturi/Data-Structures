/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package LinkedList;

/**
 * Created by z004nz7j on 1/21/2024.
 */
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
