import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args){
        int[] arr = {5,7,8,9,6,4,5,2,1};
        reverse(arr);

    }public static void reverse(int[] arr){
        int[] newarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length-i-1];

        }
        for(int i : newarr){
            System.out.print(i +" ");
        }
    } 
}