/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package LinkedList;

import static LinkedList.CreateLinkedList.printLinkedList;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class ReverseLinkedList {
    public static Node reverseList(Node head) {
        Node prevNode = null;
        Node currentNode = head;
        while(currentNode!=null){
            Node nextNode=currentNode.next;
            currentNode.next= prevNode;
            prevNode = currentNode;
            currentNode= nextNode;

        }
        head = prevNode;

        return head;
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        printLinkedList(node);
        System.out.println();
        Node head = reverseList(node);
        System.out.println("after reversing::");
        printLinkedList(head);
    }
}
