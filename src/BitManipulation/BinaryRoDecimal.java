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
public class BinaryRoDecimal {
    public static void main(String[] args) {
        String s = "111";
        int sum =0;
        int j = s.length()-1;
        for(int i =0;i<s.length();i++){

           if(s.charAt(i)=='1'){
               sum+=(1*Math.pow(2,j));
           }
            j--;
        }

        System.out.println(sum);
    }
}
