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
public class InsertNodeAtBegin {
    public static Node insertAtFirst(Node list, int newValue) {

        Node newNode = new Node(newValue);
        newNode.next = list;

        return newNode;

    }

    public static void main(String[] args) {
        Node node = new Node(10);
        Node insertAtFirst = insertAtFirst(node, 100);
        printLinkedList(insertAtFirst);
    }
}
