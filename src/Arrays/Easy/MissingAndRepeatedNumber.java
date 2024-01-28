package Arrays.Easy;

public class MissingAndRepeatedNumber {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,6,8};
        usingTempArray(array);
        int[] result = usingXor(array,array.length);
        System.out.println("repeating"+result[0]);
        System.out.println("missing"+ result[1]);
    }

    private static int[] usingXor(int[] arr, int n) {
             int xor1;

                /* Will have only single set bit of xor1 */
                int set_bit_no;

                int i;
                int x = 0;
                int y = 0;

                xor1 = arr[0];

                /* Get the xor of all array elements  */
                for (i = 1; i < n; i++)
                    xor1 = xor1 ^ arr[i];

        /* XOR the previous result with numbers from
       1 to n*/
                for (i = 1; i <= n; i++)
                    xor1 = xor1 ^ i;

                /* Get the rightmost set bit in set_bit_no */
                set_bit_no = xor1 & ~(xor1 - 1);

        /* Now divide elements into two sets by comparing
    rightmost set bit of xor1 with the bit at the same
    position in each element. Also, get XORs of two
    sets. The two XORs are the output elements. The
    following two for loops serve the purpose */
                for (i = 0; i < n; i++) {
                    if ((arr[i] & set_bit_no) != 0)
                        /* arr[i] belongs to first set */
                        x = x ^ arr[i];

                    else
                        /* arr[i] belongs to second set*/
                        y = y ^ arr[i];
                }
                for (i = 1; i <= n; i++) {
                    if ((i & set_bit_no) != 0)
                        /* i belongs to first set */
                        x = x ^ i;

                    else
                        /* i belongs to second set*/
                        y = y ^ i;
                }
                for(int j = 0; j < n; j++) {
                    if(arr[j] == y) {
                        int temp = x;
                        x = y;
                        y = temp;
                        break;
                    }
                }
                int[] result = {x, y};

                return result;
            }



    private static void usingTempArray(int[] array) {
        int[] temp = new int[array.length+1];
        int missingNumber=-1;
        int repeatingNumber=-1;
        for(int i = 0; i< array.length; i++){
            if(temp[array[i]]==0) {
                temp[array[i]] = 1;
            }
            else{
                repeatingNumber = array[i];
            }
        }

        for(int i =0;i<temp.length;i++){
            if(temp[i]==0){
                missingNumber = i;
            }
        }
        System.out.println(missingNumber);
        System.out.println(repeatingNumber);
    }
}
