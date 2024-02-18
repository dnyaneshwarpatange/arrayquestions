public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 55, 4, 8, 8, 6, 66, 8};
        int n = 10;
        System.out.print(secondlargest(arr, n)+" ");
        System.out.print(secondSmallest(arr, n));
    }

    static int secondlargest(int[] arr, int n) {
        int largest = arr[0];
        int secondlargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondlargest) {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

    static int secondSmallest(int[] arr, int n) {
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
