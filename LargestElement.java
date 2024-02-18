public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5,7,8,9,6,2,5,44,5,8,47};
        System.out.println(largest(arr));

    }
    static int largest(int[] arr){
        int largestEle = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largestEle)
            largestEle = arr[i];

        }return largestEle;
    }
    
}
