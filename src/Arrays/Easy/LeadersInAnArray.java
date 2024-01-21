/**
 * The type Device type map Controller.
 *
 * @author Chandrashekar Sadhani
 * @version 1.0.0
 * @since 09-06-2023 The Class DeviceTypeAssignmentController is controller class , used to provide end points to API related to device type assignment functionality
 */

package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z004nz7j on 1/21/2024.
 */
public class LeadersInAnArray {
    public static List< Integer > superiorElements(int []a) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = a.length;
        list.add(a[n-1]);
        int currentLeader = a[n-1];
        for(int i = a.length-2; i>= 0;i--){
            if(a[i]>currentLeader){
                currentLeader=a[i];
                list.add(a[i]);
            }
        }

        return list;
    }
}
