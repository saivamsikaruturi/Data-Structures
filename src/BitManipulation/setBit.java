/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package BitManipulation;

/**
 * Created by z004nz7j on 1/7/2024.
 */
public class setBit {
    public static void main(String[] args) {
        int n= 36;
        int i = 3;
        //creating mask
        int mask = 1 << i;
        //set bits
        int setBits = n | mask;
        System.out.println(setBits);


        int a = 26;
        int j =5;
        int clearBit = n^(1<<j);
        System.out.println(clearBit);

        //get bits
        int bit = n &(1<<j);
        System.out.println(bit);
     }
}
