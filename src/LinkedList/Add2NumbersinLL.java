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
public class Add2NumbersinLL {
     
        public Node addTwoNumbers(Node l1, Node l2) {
            Node result = new Node(0);
            Node ptr = result;
            int carry = 0;
            while(l1!=null || l2!=null){
                int sum = carry+0;
                if(l1!=null){
                    sum+=l1.data;
                    l1=l1.next;
                }
                if(l2!=null){
                    sum+=l2.data;
                    l2=l2.next;
                }

                carry = sum/10;
                sum = sum%10;
                ptr.next = new Node(sum);
                ptr = ptr.next;

            }

            if(carry == 1){
                ptr.next = new Node(carry);
            }

            return result.next;
        
    }
}
