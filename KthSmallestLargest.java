import java.util.*;
public class KthSmallestLargest {
    public static void main(String[] args) {
        int[] arr = {4,7,6,7,8,9,1,0,66};
        int k = 6;
        SmallestLargest(arr,k);
        System.out.println(SmallestLargest(arr,k));
        
    }
  

    

static int SmallestLargest(int[] arr,int k){
    Arrays.sort(arr);
    return arr[k-1];
}
}