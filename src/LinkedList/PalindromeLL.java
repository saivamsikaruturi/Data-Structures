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
public class PalindromeLL {
    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        slow = reverseList(slow);
        fast = head;
        while(slow!=null){
            if(fast.data==slow.data){
                fast=fast.next;
                slow = slow.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
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
}
