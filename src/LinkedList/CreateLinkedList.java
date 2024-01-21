/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package LinkedList;


public class CreateLinkedList {

        public static Node constructLL(int []arr) {

            if (arr == null || arr.length == 0) {
                return null;
            }

            // Create the head node
            Node head = new Node(arr[0]);
            Node current = head;

            // Iterate over the array to create the linked list
            for (int i = 1; i < arr.length; i++) {
                Node newNode = new Node(arr[i]);
                current.next = newNode;
                current = newNode;
            }

            return head;


        }

    public static void main(String[] args) {
        Node node = constructLL(new int[]{1, 2, 3, 4, 5});
        printLinkedList(node);
    }

    public static void printLinkedList(Node node) {
        while (node !=null){
            System.out.print(node.data + "->");
            node = node.next;
        }
    }
}
