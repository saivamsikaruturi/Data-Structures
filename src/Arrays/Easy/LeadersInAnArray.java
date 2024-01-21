package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;


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
