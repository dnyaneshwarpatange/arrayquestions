import java.util.*;
public class SortArray {

    public static void main(String[] args) {
        int[] arr = {8,7,9,55,7,9,55,655,4,0,9,1,7};
        msort(arr);



    }
    static void msort(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
