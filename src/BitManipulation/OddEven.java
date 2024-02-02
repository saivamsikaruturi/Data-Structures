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
public class OddEven {
    public static String oddEven(int N){

        String result = "odd";
        if((N&1)==0)
        {
            result="even";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(oddEven(21));
        System.out.println(oddEven(10));
    }
}

