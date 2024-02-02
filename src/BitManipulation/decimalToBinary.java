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
public class decimalToBinary {
    public static void main(String[] args) {
        int n = 32;
        decimal(n);
    }

    static String decimal(int n) {

        String b = "";
        while(n>=1){
            n=n/2;
            int r = n%2;
            b = r+b;
        }
        return b;
    }
}
