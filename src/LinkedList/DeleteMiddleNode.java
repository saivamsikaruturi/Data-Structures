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
public class DeleteMiddleNode
{
    public static Node deleteMiddle(Node head) {

        if(head==null || head.next==null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev=null;

        while(fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;

        }
        prev.next = slow.next;
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
        Node head = deleteMiddle(node);
        System.out.println("after deleting::");
        printLinkedList(head);

    }

}
