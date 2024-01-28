package Arrays.Easy;

public class getSecondMaxAndMin {
    public static int[] getSecondOrderElements(int n, int []a) {
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for(int i =0;i<=n-1;i++){
            if(a[i]>max){
                second_max=max;
                max=a[i];
            }
            else if(a[i]>second_max && a[i]<max){
                second_max=a[i];
            }
        }
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;
        for(int i =0;i<=n-1;i++){
            if(a[i]<min){
                second_min=min;
                min=a[i];
            }
            else if(a[i]<second_min && a[i]>min){
                second_min=a[i];
            }
        }
        int[] result = new int[2];
        result[0]=second_max;
        result[1]=second_min;




        return result;
    }
}
